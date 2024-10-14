import java.sql.*;

public class demoJDBC {
    public static void main(String[] args) throws Exception {

        int sid = 102;
        String sname = "ssf";
        int marks = 43;
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";

        Class.forName("org.postgresql.Driver");
        String sql = "insert into student values(?,?,?)";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to PostgreSQL database");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        int rowsAffected = st.executeUpdate();
        System.out.println("Rows inserted: " + rowsAffected);
        con.close();
        System.out.println("Closed connection");
    }
}
