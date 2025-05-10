import java.sql.*;

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


        String url="jdbc:postgresql://localhost:5432/demo";
        String insertQuery="insert into student values(?,?,?)";

        try{
            Connection connection= DriverManager.getConnection(url,"postgres","123");
            System.out.println("Connection established!");

            PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1,4);
            preparedStatement.setInt(2,99);
            preparedStatement.setString(3,"Luka Qurkhuli");
            preparedStatement.execute();


            connection.close();
            System.out.println("Connection Closed!");

        }catch (SQLException e){
            System.out.println(e);
        }



    }
}
