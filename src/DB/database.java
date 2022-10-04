package DB;
import java.sql.*;
public class database{
    public static Connection con;
    protected static String prevhash;
    protected static String tans_det;
    protected static String block_hash;
    public database(String prevhash, String tans_det, String block_hash) throws SQLException, ClassNotFoundException {

        this.prevhash=prevhash;
        this.block_hash=block_hash;
        this.tans_det=tans_det;

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/blockchain","root","anant");

    }
    //no parameter constructor;
    public database() throws SQLException {con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/blockchain","root","anant");}
    public String prevhash() throws SQLException {
        Statement stmt=con.createStatement();
        ResultSet ans = stmt.executeQuery("SELECT Block_hash FROM blockinfo ORDER BY block_number DESC LIMIT 1");
        if(ans.next())
            return ans.getString(1);
        return "0";
    }
    public void insert() throws SQLException {
        Statement stmt=con.createStatement();

        String sqlquerry = "INSERT INTO blockinfo VALUES(NULL,'"+prevhash+"','"+tans_det+"','"+block_hash+"')";
        stmt.executeUpdate(sqlquerry);
    }
    public void print() throws SQLException {

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from blockinfo");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+ "  " + rs.getString(4));
        }
    }
}