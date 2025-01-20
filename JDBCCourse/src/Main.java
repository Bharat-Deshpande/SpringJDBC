import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
            /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close
             */

        String url = "jdbc:postgresql://localhost:5432/Demo" ;
        String uname = "postgres" ;
        String pass = "0000" ;
//        String sql = "select sname from student where sid=1";
//
//        //Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url,uname,pass);
//        System.out.println("Connection Established");
//        Statement st = con.createStatement();

//        //System.out.println(rs.next());
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the student is: " + name);
//        con.close();
//        System.out.println("Connection Closed");

//        String sql = "select * from student" ;
//        ResultSet rs = st.executeQuery(sql);
//
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }
        int sid = 102;
        String sname = "Jasmine";
        int marks = 65;

        //String sql = "insert into student values(" + sid +",'"+ sname+"',"+ marks + ")";
        //String sql = "update student set sname='Max' where sid=5";
        //String sql = "delete from student where sid=5";

        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();
        con.close();
    }
}