package DbConnect;

import java.sql.*;
import java.io.*;
import java.util.*;

public abstract class Broker<T> {
	// Einschub-Methode, die von Subklassen zu implementieren ist
	protected abstract T makeObject(ResultSet rs)
	throws SQLException;
	
	// SQL-Abfrage mit Rückgabe der Ergebnismenge
	protected Vector<T> query(String sql) throws IOException, 
	ClassNotFoundException, SQLException {
		Vector<T> result = new Vector<T>();
		
		Connection con = null;
		Statement s = null;
		ResultSet rs = null;
		try {
			con = ConnectionManager.getConnection();
			s = con.createStatement();
			rs = s.executeQuery(sql);
			while (rs.next()) {
				result.add(makeObject(rs));
			}
			return result;
		}
		finally {
			if (rs != null)
				rs.close();
			if (s != null)
				s.close();
		}
	}
	
	// SQL-Insert, -Update oder-Delete
	protected int update(String sql) throws IOException, 
	ClassNotFoundException, SQLException {
		
		Connection con = null;
		Statement s = null;
		int count = 0;
		
		try {
			con = ConnectionManager.getConnection();
			s = con.createStatement();
			count = s.executeUpdate(sql);
			return count;
		}
		finally {
			if (s != null)
				s.close();
		}
	}
}
