package edu.matkosoric.jdbc.result.set;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class TourismByMonths {

    // traversing the ResultSet object with cursor

    public static void main(String[] args) throws ClassNotFoundException {

        Connection conn = null;
        PreparedStatement preparedStatement;
        Statement statement;
        ResultSet resultSet = null;
        String createSQL = "CREATE TABLE turizam2016 ("
                + "id INTEGER NOT NULL,"
                + "mjesec VARCHAR(30) NOT NULL, "
                + "broj_nocenja INTEGER)";

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            conn = DriverManager.getConnection("jdbc:derby:derby/TourismByMonths;create=true");
            conn.setAutoCommit(false);
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute(createSQL);

            // insert data set
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (1, 'Siječanj', 394353)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (2, 'Veljača', 425593)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (3, 'Ožujak', 847986)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (4, 'Travanj', 1676660)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (5, 'Svibanj', 4270234)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (6, 'Lipanj', 8960910)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (7, 'Srpanj', 22852480)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (8, 'Kolovoz', 25473938)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (9, 'Rujan', 9666033)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (10, 'Listopad', 2275386)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (11, 'Studeni', 612032)");
            statement.executeUpdate("INSERT INTO turizam2016 VALUES (12, 'Prosinac', 594247)");

            // ordinary SELECT
            printingSQLresults(statement.executeQuery("SELECT * FROM turizam2016"));


            // copy values from two database columns to a map
            Map<String, Integer> turizam2016 = new HashMap<>();
            resultSet = statement.executeQuery("SELECT mjesec, broj_nocenja FROM turizam2016 ");
            while (resultSet.next()) {
                String mjesec = resultSet.getString("mjesec");
                Integer brojNocenja = resultSet.getInt("broj_nocenja");
                turizam2016.put(mjesec, brojNocenja);
            }
            System.out.println(turizam2016);

            // repeated example, with small change, since
            // database columns can be referred to by id number
            Map<String, Integer> turizam2016_2 = new HashMap<>();
            resultSet = statement.executeQuery("SELECT mjesec, broj_nocenja FROM turizam2016 ");
            while (resultSet.next()) {
                String mjesec = resultSet.getString(1);
                Integer brojNocenja = resultSet.getInt(2);
                // columns indexes start with 1, not 0
//                 int cellValue = resultSet.getInt(0);   // compiles, but throws a runtime exception
                turizam2016_2.put(mjesec, brojNocenja);
            }
            System.out.println(turizam2016_2);

            // using cursor to navigate result set
            resultSet = statement.executeQuery("SELECT mjesec, broj_nocenja FROM turizam2016 ");        // unnecessary
            resultSet.afterLast();
            System.out.println(resultSet.previous());                   // true
            System.out.println(resultSet.getString(1));     // prosinac

            System.out.println(resultSet.first());                      // true
            System.out.println(resultSet.getString(1));     // siječanj

            System.out.println(resultSet.next());                       // true
            System.out.println(resultSet.getString(1));     // veljača

            System.out.println(resultSet.next());                       // true
            System.out.println(resultSet.getString(1));     // ožujak

            System.out.println(resultSet.next());                       // true
            System.out.println(resultSet.getString(1));     // travanj
//            System.out.println(resultSet.beforeFirst());                // does not compile, return is void
//            System.out.println(resultSet.afterLast());                  // does not compile, return is void
            resultSet.beforeFirst();
//            System.out.println(resultSet.getString(1));     // compiles, but throws SQLException at runtime ("Invalid cursor state - no current row.")


            // method absolute() moves cursor to the desired position
            // it can be called with positive integer (index numbers start at the beginning of the result set)
            // and with negative integer (index numbers start at the end, with -1 designating last row)
            resultSet = statement.executeQuery("SELECT mjesec, broj_nocenja FROM turizam2016 ");        // unnecessary, but useful for too much scrolling
            System.out.println(resultSet.absolute(4));             // true
            System.out.println(resultSet.getString(1));     // travanj

            System.out.println(resultSet.absolute(12));            // true
            System.out.println(resultSet.getString(1));     // prosinac

            System.out.println(resultSet.absolute(0));             // false, cursor is positioned before any rows
            System.out.println(resultSet.absolute(13));            // false, cursor is positioned after all rows

            System.out.println(resultSet.absolute(-1));            // true
            System.out.println(resultSet.getString(1));     // prosinac

            System.out.println(resultSet.absolute(-2));            // true
            System.out.println(resultSet.getString(1));     // studeni

            System.out.println(resultSet.absolute(-3));            // true
            System.out.println(resultSet.getString(1));     // listopad

            System.out.println(resultSet.absolute(-12));           // true
            System.out.println(resultSet.getString(1));     // siječanj

            System.out.println(resultSet.absolute(-13));           // false


            // method relative() moves cursor several rows forward or backward
            resultSet = statement.executeQuery("SELECT mjesec, broj_nocenja FROM turizam2016 ");        // unnecessary, but useful for too much scrolling
            resultSet.beforeFirst();                                      // initial state, cursor is before first row
            System.out.println(resultSet.relative(1));              // true
            System.out.println(resultSet.getString(1));       // siječanj

            System.out.println(resultSet.relative(2));              // true
            System.out.println(resultSet.getString(1));       // ožujak

            System.out.println(resultSet.relative(2));              // true
            System.out.println(resultSet.getString(1));       // svibanj

            System.out.println(resultSet.relative(4));              // true
            System.out.println(resultSet.getString(1));       // rujan

            System.out.println(resultSet.relative(3));              // true
            System.out.println(resultSet.getString(1));       // prosinac

            System.out.println(resultSet.relative(4));              // false
//            System.out.println(resultSet.getString(1));                 // SQL exception, cursor is pointing to the position after the last row

            System.out.println(resultSet.relative(-1));             // true
            System.out.println(resultSet.getString(1));       // prosinac

            System.out.println(resultSet.relative(-11));            // true
            System.out.println(resultSet.getString(1));       // siječanj

            System.out.println(resultSet.relative(-500));           // false
//            System.out.println(resultSet.getString(1));                // SQL exception, cursor is pointing to the position before the first row

            System.out.println(resultSet.relative(2));              // true
            System.out.println(resultSet.getString(1));       // veljača


            // deleting table
            statement.execute("DROP TABLE turizam2016");
            conn.commit();

        } catch (SQLException e) {
            System.out.println("SQL exception! " + e);
        }

        // check whether database has been properly shut down
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

    static void printingSQLresults(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            System.out.printf("%-5d %-10s - %d \n",
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3));
        }
    }


}
