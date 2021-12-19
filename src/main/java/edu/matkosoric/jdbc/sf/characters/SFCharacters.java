package edu.matkosoric.jdbc.sf.characters;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.sql.*;


public class SFCharacters {

    // setting up a Derby database with embedded driver

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt;
        Statement stmt;
        ResultSet rs = null;
        String createSQL = "CREATE TABLE person ("
                + "id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (start with 1, increment by 1),"
                + "name VARCHAR(30) NOT NULL, "
                + "email VARCHAR(30),"
                + "phone VARCHAR(11),"
                + "CONSTRAINT primary_key PRIMARY KEY (id))";

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            conn = DriverManager.getConnection("jdbc:derby:derby/SFcharacters;create=true");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            stmt.execute(createSQL);

            // inserting three distinct rows
            pstmt = conn.prepareStatement("INSERT INTO person (name, email, phone) values(?,?,?)");
            pstmt.setString(1, "Matko Sorić");
            pstmt.setString(2, "soric.matko@gmail.com");
            pstmt.setString(3, "091-555-222");
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("INSERT INTO person (name, email, phone) values(?,?,?)");
            pstmt.setString(1, "Ellen Ripley");
            pstmt.setString(2, "ripley.ellen@nostromo.com");
            pstmt.setString(3, "091-555-333");
            pstmt.executeUpdate();

            pstmt = conn.prepareStatement("INSERT INTO person (name, email, phone) values(?,?,?)");
            pstmt.setString(1, "Rick Deckard");
            pstmt.setString(2, "deckard.rick@tyrell.com");
            pstmt.setString(3, "091-555-444");
            pstmt.executeUpdate();

            // SELECT statement with formatted output
            rs = stmt.executeQuery("select * from person");
            while (rs.next()) {
                System.out.printf("%d - %s - %s - %s\n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }

            // dropping the table to avoid exception in the next execution
            stmt.execute("DROP TABLE person");

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