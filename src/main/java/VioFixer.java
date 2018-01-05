
public class VioFixer {
public static void main(String args[]) throws SQLException, IOException{		
			String result = "";
			ResultSet rs = null;
			Statement stmt = null;
			Connection con = null;
			Runtime.getRuntime().exec(args[0]);
			HttpServletRequest servletRequest = null;
			String columnName = servletRequest.getParameter("columnName");
			try {
				String query = "select * from tablename where columnname = "+columnName ;
				stmt = con.createStatement();
				rs = stmt.executeQuery(query);					
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
