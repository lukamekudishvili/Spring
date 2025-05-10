import java.sql.*;

public class DemoJdbc {
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

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "123";
        String sql="select * from student";

        try {
            Connection connection =
                    DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established!");
            Statement st=connection.createStatement();
            ResultSet data=st.executeQuery(sql);
//            data.next();
//            String name=data.getString("sname");  //these 3 lines works when retrieving only 1 row
//            System.out.println(name);

            while(data.next()){
                System.out.print(data.getInt(1)+" ");
                System.out.print(data.getInt(2)+" ");
                System.out.print(data.getString(3));
                System.out.println();

            }
            connection.close();
            System.out.println("Connection closed!");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
