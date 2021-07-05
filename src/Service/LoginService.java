package Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import Connection.Util;

public class LoginService {
	
	public boolean save(String uNmae,String pswd) {
		
		String select_sql="SELECT * FROM SIGNUP1 WHERE USERNAME= '"+uNmae+"' and password='"+pswd+"'";
		Util util1=new Util();
		ResultSet rs=util1.executeSelect(select_sql);
	
		try {
			while(rs.next()) {
				if(rs.getString(1).equals(uNmae) && rs.getString(2).equals(pswd)) {
					return true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
}
