package edu.matkosoric.jdbc.employees;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.sql.*;

public class Employees {

    // what is in database?
    // 101 - SMITH - HR
    // 102 - JONES - HR

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt;
        ResultSet rs = null;
        String createSQL = "CREATE TABLE EMP ("
                + "id INTEGER NOT NULL,"
                + "surname VARCHAR(30) NOT NULL, "
                + "department VARCHAR(30))";

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            conn = DriverManager.getConnection("jdbc:derby:employees;create=true");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            stmt.execute(createSQL);

            PreparedStatement ps = conn.prepareStatement("INSERT INTO EMP VALUES(?, ?, ?) ");
            ps.setInt(1, 101);
            ps.setString(2, "SMITH");
            ps.setString(3, "HR");
            ps.executeUpdate();
            ps.setInt(1, 102);
            ps.setString(2, "JONES");

            ps.executeUpdate();

            // SELECT statement with formatted output
            rs = stmt.executeQuery("select * from EMP");
            while (rs.next()) {
                System.out.printf("%d - %s - %s\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                );
            }

            // dropping the table to avoid exception in the next execution
            stmt.execute("DROP TABLE EMP");

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
