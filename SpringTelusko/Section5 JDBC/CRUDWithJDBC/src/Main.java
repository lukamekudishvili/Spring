import javax.xml.transform.Result;
import java.sql.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*
         *   import package
         *   load and register
         *   create connection
         *   create statement
         *   execute statement
         *   process the results
         *   close connection
         * */

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        String url, user, password;
        url = "jdbc:postgresql://localhost:5432/demo";
        user = "postgres";
        password = "123";
        String query = "select * from student";
        String insertQuery = "insert into student values(4, 56, 'Luka Kurkhuli')";
        String updateQuery="update student set sname='Luka Qurkhuli' where sid=4";
        String deleteQuery="Delete from student where sid=4";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            Statement statement = con.createStatement();
//            boolean status=statement.execute(insertQuery); //INSERT
//            System.out.println(status);
//            statement.execute(updateQuery); //UPDATE
            statement.execute(deleteQuery);



            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
