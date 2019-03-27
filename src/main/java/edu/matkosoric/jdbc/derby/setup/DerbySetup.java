package edu.matkosoric.jdbc.derby.setup;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.sql.*;

public class DerbySetup {

    // test connection to the Derby database
    // delete previously created table, insert new records,
    // and print them.
    // try with resources automatically closes connection

    public static void main(String[] args) throws Exception{

        String url = "jdbc:derby:derbyMatko;create=true";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // cleaning up the schema before creating new table
            DatabaseMetaData metaData = conn.getMetaData();
            String[] names = {"TABLE"};
            ResultSet tablenames = metaData.getTables(null, null, null, names);
            while (tablenames.next()) {
                if (tablenames.getString("TABLE_NAME").length() > 0) {
                    String tableName = tablenames.getString("TABLE_NAME");
                    System.out.println(tableName);
                    stmt.execute("DROP TABLE " + tableName);
                }
            }

            // fresh start
            stmt.executeUpdate("CREATE TABLE gradovi (ID INT PRIMARY KEY, NAME VARCHAR(15))");

            // INSERT INTO
            stmt.executeUpdate("INSERT INTO gradovi VALUES (1, 'Zagreb')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (2, 'Zadar')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (3, 'Rijeka')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (4, 'Osijek')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (5, 'Split')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (6, 'Dubrovnik')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (7, 'Varaždin')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (8, 'Slavonski brod')");
            stmt.executeUpdate("INSERT INTO gradovi VALUES (9, 'Gračac')");


            ResultSet rs = stmt.executeQuery("SELECT * FROM gradovi");

            // reading from the embedded Derby database
            while (rs.next())
                System.out.println(rs.getString(1) + " : " + rs.getString(2));


        }

    }
}
