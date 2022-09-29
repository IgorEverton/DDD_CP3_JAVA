package aula19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import aula19.ConexaoDB;

public class Dao {
	public static boolean InsertUpdateDeleteCommand(String SQLCommand) {
		boolean result = false;
		
		try {
			Connection conn = ConexaoDB.getConnection();
			Statement statement = conn.createStatement(); 
			statement.executeUpdate(SQLCommand);
		}catch(Exception e) {
			System.out.print(e);
		}
		result = true;
		
		return result;
		
		
	}
	public static ResultSet SelectCommando(String SQLCommand) {
		ResultSet rs = null;
	}
	try {
		Connection conn = ConexaoDB.getConnection();
		State
	}
}
