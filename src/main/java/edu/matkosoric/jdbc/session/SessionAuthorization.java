package edu.matkosoric.jdbc.session;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SessionAuthorization {

    // Is A or B the correct replacement for sql statement and why?
    // A, because it sends exactly the value of user provided by the calling code.

    public static void main(String[] args) {
    }

    void setSessionUser(Connection conn, String user) throws SQLException {
        Statement stmt = conn.createStatement();
        String sql1 = "SET SESSION AUTHORIZATION " + user;
        stmt.execute(sql1);

//        String sql2 = "SET SESSION AUTHORIZATION " + stmt.enquoteIdentifier(user);  // does not compile
//        stmt.execute(sql2);
    }

}
