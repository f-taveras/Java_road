
import java.sql.*;

class Assignment1 {

    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String pass = "postgres123";

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(url, username, pass);

        String createTableSql = "CREATE TABLE IF NOT EXISTS student ("
                + "id SERIAL PRIMARY KEY, "
                + "name VARCHAR(50) NOT NULL, "
                + "age INT, "
                + "marks DOUBLE PRECISION)";

        Statement stmt = con.createStatement();
        stmt.execute(createTableSql);
        System.out.print("DB verified");

        // String student1 = "INSERT INTO student (name, age, marks) VALUES (?, ?, ?)";
        // PreparedStatement pstmt = con.prepareStatement(student1);
        // pstmt.setString(1, "Marcelo");
        // pstmt.setInt(2, 14);
        // pstmt.setDouble(3, 100.0);
        // pstmt.execute();

        // String student2 = "INSERT INTO student (name, age, marks) VALUES (?, ?, ?)";
        // PreparedStatement pstmt2 = con.prepareStatement(student2);
        // pstmt2.setString(1, "Stephanie");
        // pstmt2.setInt(2, 16);
        // pstmt2.setDouble(3, 79.5);
        // pstmt2.execute();

        String selectSql = "SELECT * FROM student";

        Statement stmtRs = con.createStatement();
        ResultSet rs = stmtRs.executeQuery(selectSql);
        while (rs.next()) {
            System.out.printf("ID: %d, Name: %s, Age: %d, Marks: %.2f%n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getDouble("marks"));
        }

        String hsSql = "SELECT * FROM student WHERE marks > 75";
        Statement stmtHS = con.createStatement();
        ResultSet rsHs = stmtHS.executeQuery(hsSql);
        while (rsHs.next()) {
            System.out.printf("Students Higher than 75: ID: %d, Name: %s, Age: %d, Marks: %.2f%n",
                    rsHs.getInt("id"),
                    rsHs.getString("name"),
                    rsHs.getInt("age"),
                    rsHs.getDouble("marks"));
        }

    }
}
