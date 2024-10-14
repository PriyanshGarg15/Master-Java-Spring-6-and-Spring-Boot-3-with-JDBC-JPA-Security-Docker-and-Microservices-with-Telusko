import java.sql.*;
public class demoJDBC {
    public static void main(String[] args) throws Exception
    {
        /*
        import package
        load and register
        crate connection
        execute statement
        process and results
        close
         */
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="0000";
        Class.forName("org.postgresql.Driver");
//      String sql="insert into student values (6,'john',33)"; //create
//        String sql="update student set sname='MAAX' where sid=5"; //update
        String sql="delete from student where sid=5";  //delete
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to PostgreSQL database");

        Statement st=con.createStatement();


        int status=st.executeUpdate(sql);
        System.out.println(status);

        con.close();
        System.out.println("Closed connection");



    }
}
