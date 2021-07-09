package edu.matkosoric.jdbc.statement.execution;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 11 SE, 2021.
 * Created by © Matko Soric.
 */


import java.sql.*;

public class GradoviIZupanije {

    // demonstration of basic JDBC statements

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement preparedStatement;
        Statement statement;
        ResultSet resultSet = null;
        int affectedRows;

        // SHEMA
        String createSQL = "CREATE TABLE hrvatska ("
                + "id INTEGER NOT NULL ,"
                + "zupanija_ime VARCHAR(30) NOT NULL, "
                + "povrsina_km INTEGER,"
                + "broj_gradova INTEGER,"
                + "CONSTRAINT primary_key PRIMARY KEY (id))";

        try {

            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());

            conn = DriverManager.getConnection("jdbc:derby:derbyMatko3;create=true");
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.execute(createSQL);

            // INSERT INTO
            statement.executeUpdate("INSERT INTO hrvatska VALUES (1, 'Republika Hrvatska', 56594, 123)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (2, 'Zagrebačka', 3060, 8)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (3, 'Krapinsko-zagorska ', 1229, 7)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (4, 'Sisačko-moslavačka ', 4468, 6)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (5, 'Karlovačka ', 3626, 5)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (6, 'Varaždinska ', 1262, 6)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (7, 'Koprivničko-križevačka ', 1748, 3)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (8, 'Bjelovarsko-bilogorska ', 2640, 5)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (9, 'Primorsko-goranska ', 3588, 14)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (10, 'Ličko-senjska ', 5353, 4)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (11, 'Virovitičko-podravska ', 2024, 3)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (12, 'Požeško-slavonska ', 1823, 4)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (13, 'Brodsko-posavska ', 2030, 2)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (14, 'Zadarska ', 3646, 6)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (15, 'Osječko-baranjska ', 4155, 7)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (16, 'Šibensko-kninska ', 2984, 5)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (17, 'Vukovarsko-srijemska ', 2454, 4)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (18, 'Splitsko-dalmatinska ', 4540, 16)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (19, 'Istarska ', 2813, 9)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (20, 'Dubrovačko-neretvanska ', 1781, 5)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (21, 'Međimurska ', 729, 3)");
            statement.executeUpdate("INSERT INTO hrvatska VALUES (22, 'Grad Zagreb', 641, 1)");

            // SELECT statement with printing
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska"));

            // UPDATE
            // changing the value of specific entry
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id = 6"));      // before
            affectedRows = statement.executeUpdate("UPDATE hrvatska SET povrsina_km = 200 where id = 6");
            System.out.println("Rows affected with UPDATE: " + affectedRows);
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id = 6"));      // after

            // changing the value of several entries
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id > 20"));      // before
            affectedRows = statement.executeUpdate("UPDATE hrvatska set povrsina_km = 300 where id > 20");
            System.out.println("Rows affected with UPDATE: " + affectedRows);
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id > 20"));      // after

            // DELETE
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id = 16 OR id = 17 OR id = 18"));      // before
            affectedRows = statement.executeUpdate("DELETE FROM hrvatska where id = 17");
            System.out.println("Rows affected with DELETE: " + affectedRows);
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska WHERE id = 16 OR id = 17 OR id = 18"));      // after

            // possible wrong combinations of execute methods and SQL statements
            // execute() accepts all SQL statements
            statement.execute("SELECT * FROM hrvatska WHERE id = 9");
            statement.execute("INSERT INTO hrvatska VALUES (50, 'nepostojeca zupanija', 2, 2 )");
            statement.execute("UPDATE hrvatska SET povrsina_km = 7000 WHERE id = 9");
            statement.execute("DELETE FROM hrvatska WHERE id = 9");

            // executeQuery() accepts only SELECT
            statement.executeQuery("SELECT * FROM hrvatska WHERE id = 10");
//            statement.executeQuery("INSERT INTO hrvatska VALUES (51, 'nepostojeca zupanija', 2, 2 )");
//            statement.executeQuery("UPDATE hrvatska SET povrsina_km = 7000 WHERE id = 10");
//            statement.executeQuery("DELETE FROM hrvatska WHERE id = 10");

            // executeUpdate() accepts every statement except SELECT
//            statement.execute("SELECT * FROM hrvatska WHERE id = 11");
            statement.execute("INSERT INTO hrvatska VALUES (52, 'nepostojeca zupanija', 2, 2 )");
            statement.execute("UPDATE hrvatska SET povrsina_km = 7000 WHERE id = 11");
            statement.execute("DELETE FROM hrvatska WHERE id = 11");

            // example of SQL INJECTION
            String sqlInjection = "OR 1 = 1";
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska"));      // before
            affectedRows = statement.executeUpdate("DELETE FROM hrvatska WHERE povrsina_km < 1000 " + sqlInjection);
            System.out.println("Rows affected with DELETE: " + affectedRows);       // deletes all items in the table
            printingSQLresults(statement.executeQuery("SELECT * FROM hrvatska"));      // after


            // deleting table
            statement.execute("DROP TABLE hrvatska");
            conn.commit();

        } catch (SQLException e) {
            System.out.println("Exception! " + e);
        }

        // check whether database has been properly shut down
        try {
            DriverManager.getConnection ("jdbc:derby:;shutdown=true");
        } catch (SQLException ex) {
            if (((ex.getErrorCode() == 50000) && ("XJ015".equals(ex.getSQLState())))) {
                System.out.println("Derby shut down normally");
            } else {
                System.err.println("Derby did not shut down normally");
                System.err.println(ex.getMessage());
            }
        }
    }


    static void printingSQLresults (ResultSet resultSet) throws SQLException{
        while (resultSet.next()) {
            System.out.printf("%-10d - %-25s - %-7d - %d\n",
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getInt(4));
        }
    }
}
