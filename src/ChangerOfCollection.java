import java.sql.*;

public class ChangerOfCollection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/collectionOfDisks",
                "postgres",
                "UgaBuga");
        System.out.println("DB is opened");
        Statement stmt = connection.createStatement() ;
        connection.close();
    }
}