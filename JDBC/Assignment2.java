
import java.sql.*;

public class Assignment2 {
    // TODO: Add database connection details

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String pass = "postgres123";

    public static void main(String[] args) throws Exception {
        // TODO: Create EMAIL table (id SERIAL PRIMARY KEY, email VARCHAR(100))

        Connection con = DriverManager.getConnection(URL, username, pass);

        String createTableSql = "CREATE TABLE IF NOT EXISTS EMAIL ("
                + "id SERIAL PRIMARY KEY, "
                + "email VARCHAR(50) NOT NULL)";

        Statement stmt = con.createStatement();
        stmt.execute(createTableSql);

        // TODO: Insert duplicate email records
        String insertSQL = "INSERT INTO EMAIL (email) VALUES (?)";
        PreparedStatement insertStmt = con.prepareStatement(insertSQL);
        insertStmt.setString(1, "test2@test.com");
        insertStmt.execute();

        String uniqueSql = "SELECT DISTINCT EMAIL FROM EMAIL";
        Statement uniqueEmail = con.createStatement();
        ResultSet rs = uniqueEmail.executeQuery(uniqueSql);
        while (rs.next()) {
            System.out.println(
                     "Email: " + rs.getString("email")
            );

        }

        // TODO: Fetch unique emails using SQL DISTINCT
        // TODO: Remove duplicate emails using SQL DELETE with USING clause
        // TODO: Display remaining unique emails
        // TODO: Explain database-level vs collection-level duplicate handling
    }
}
