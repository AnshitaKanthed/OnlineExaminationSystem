import java.sql.*;
public class db{
    public static Connection mycon()

    { Connection con =null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Kanthed@45"); }
    catch (ClassNotFoundException | SQLException e)
        { System.out.println(e.getMessage());
}

    return con;

}
    public void createUserSpecficTable(String tableName) throws SQLException {
        Connection conn = mycon();
        Statement stmt = conn.createStatement();

        String sql = String.format("CREATE TABLE IF NOT EXISTS %s (" +
        " username           VARCHAR(25)      PRIMARY KEY        UNIQUE        , " +        
        " Name               VARCHAR(25)                         NULL          , " +
        " Java               VARCHAR(25)                         NULL          , " +
        " Python             VARCHAR(25)                         NULL          , " +
        " C                  VARCHAR(25)                         NULL);", tableName);
        stmt.executeUpdate(sql);
        System.out.println("Created user specific table in given database...");
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//class Opertions {
//    private Connection conn = null;
//    private static Statement stmt = null;
//
//    Opertions() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "Kanthed@45");
//        System.out.println("Connection is created successfully:");
//        stmt = (Statement) conn.createStatement();
//    }
//
//    public void createUser(String username, String password) throws SQLException {
//        String sqlQuery = String.format("INSERT INTO std_info VALUES ('%s', '%s');", username, password);
//        stmt.executeUpdate(sqlQuery);
//        System.out.println("User Inserted");
//    }
//
//    public void readUsers() throws SQLException {
//        String sqlQuery = "SELECT * FROM std_info";
//        ResultSet rs = stmt.executeQuery(sqlQuery);
//
//        while (rs.next()) {
//            System.out.println(rs.getString("username"));
//            System.out.print(rs.getString("password"));
//            System.out.println("\n\n");
//        }
//    }
//}
