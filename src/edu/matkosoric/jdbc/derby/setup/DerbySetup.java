package edu.matkosoric.jdbc.derby.setup;

/*
 * Code examples for Oracle Certified Associate (OCA) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DerbySetup {

    // test connection to the Derby database

    public static void main(String[] args) throws Exception{

        String url = "jdbc:derby:badabok;create=true";
//        String url = "jdbc:derby://localhost:1527/:Badabok;create=true";

//        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
//        Class.forName(driver).newInstance();
//        String url = "jdbc:derby://localhost:1527/MyDbTest;user=tmpuser;create=true";

        try (Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");

//                    "CREATE TABLE species ("
//                    + "id INTEGER PRIMARY KEY,"
//                    + "name VARCHAR(255));");



        }




    }

}
