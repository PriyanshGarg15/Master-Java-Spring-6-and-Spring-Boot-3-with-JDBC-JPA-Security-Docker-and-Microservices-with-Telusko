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
;       Class.forName("org.postgresql.Driver");
        String sql="select * from student";
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to PostgreSQL database");

        Statement st=con.createStatement();


        ResultSet rs=st.executeQuery(sql);
//        rs.next();
//        String name=rs.getString("sname");
//        System.out.println("Name of the student is "+name);
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        con.close();
        System.out.println("Closed connection");



    }
}
