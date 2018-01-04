import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class VioFixerTest {

	public static void main(String args[]) throws SQLException{		
			String result = "";
			ResultSet rs = null;
			Statement stmt = null;
			Connection con = null;
			String columnName = "";
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from tablename where columnname = "+columnName);						
				if (rs.next()) {
					result = rs.getString("xyz");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			}	
	}	
}
