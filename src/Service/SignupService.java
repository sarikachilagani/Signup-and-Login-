package Service;

import Connection.Util;

public class SignupService {

	public boolean save(String userName, String password, String email, int phoneNumber) {
//		String create_sql="CREATE TABLE SIGNUP1(USERNAME VARCHAR(20),PASSWORD VARCHAR(20),EMAIL VARCHAR(20),PHONENUMBER INTEGER)";
		String insert_sql = "INSERT INTO SIGNUP1 VALUES ('" + userName + "','" + password + "','" + email + "',"
				+ phoneNumber + ")";
		Util util = new Util();
		int val = util.execute(insert_sql);
		return val == 1 ? true : false;
	}

}
