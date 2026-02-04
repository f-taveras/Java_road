
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
        insertStmt.setString(1, "test3@test.com");
        insertStmt.execute();

        // TODO: Fetch unique emails using SQL DISTINCT
        String uniqueSql = "SELECT DISTINCT EMAIL FROM EMAIL";
        Statement uniqueEmail = con.createStatement();
        ResultSet rs = uniqueEmail.executeQuery(uniqueSql);
        while (rs.next()) {
            System.out.println(
                     "Email: " + rs.getString("email")
            );

        }

        // TODO: Remove duplicate emails using SQL DELETE with USING clause
        String deleteDupSql = "DELETE FROM EMAIL e1 USING EMAIL e2 " +
                              "WHERE e1.id > e2.id AND e1.email = e2.email";

        Statement deleteDups = con.createStatement();
        deleteDups.executeUpdate(deleteDupSql);
        

        // TODO: Display remaining unique emails
        // TODO: Explain database-level vs collection-level duplicate handling
        System.out.println("Database-level: Uses SQL (DISTINCT, UNIQUE constraints) to manage data on disk. Persistent and shared across all users.");
        System.out.println("Collection-level: Uses Java structures (Set, Map) to manage data in memory. Temporary and limited to this specific running program.");
    }
}
