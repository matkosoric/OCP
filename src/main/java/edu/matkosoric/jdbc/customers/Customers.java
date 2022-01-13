package edu.matkosoric.jdbc.customers;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.sql.*;

public class Customers {

    // Which statement inserted on line 14 sets NAME column to a NULL value?
    // ps.setNull(2, java.sql.Types.VARCHAR);

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt;
        ResultSet rs = null;
        String createSQL = "CREATE TABLE CUSTOMER ("
                + "id INTEGER NOT NULL,"
                + "name VARCHAR(30))";

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            conn = DriverManager.getConnection("jdbc:derby:derby/CUSTOMER;create=true");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            stmt.execute(createSQL);

            PreparedStatement ps = conn.prepareStatement("INSERT INTO CUSTOMER VALUES(?, ?) ");
            ps.setInt(1, 42);
            ps.setNull(2, java.sql.Types.VARCHAR);
            ps.executeUpdate();

            // SELECT statement with formatted output
            rs = stmt.executeQuery("select * from CUSTOMER");
            while (rs.next()) {
                System.out.printf("%d - %s \n",
                        rs.getInt(1),
                        rs.getString(2)
                );
            }

            // dropping the table to avoid exception in the next execution
            stmt.execute("DROP TABLE CUSTOMER");

            conn.commit();

        } catch (SQLException ex) {
            System.out.println("in connection" + ex);
        }

        try {
            DriverManager.getConnection("jdbc:derby:;shutdown=true");
        } catch (SQLException ex) {
            if (((ex.getErrorCode() == 50000) && ("XJ015".equals(ex.getSQLState())))) {
                System.out.println("Derby shut down normally");
            } else {
                System.err.println("Derby did not shut down normally");
                System.err.println(ex.getMessage());
            }
        }
    }
}
