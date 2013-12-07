package DbConnect;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	private static final String FILE = "/DbConnect/dbparam.txt"; // File mit
																	// Treiber
																	// und
																	// Datenfilepfad
																	// zu DB
																	// sowie
																	// User und
																	// Passwort
																	// File
																	// liegt im
																	// gleichen
																	// Ordner
																	// wie
																	// Source-Code!
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static Connection con;

	// Verbindung zur DB herstellen
	public static Connection getConnection(String file) throws IOException,
			ClassNotFoundException, SQLException {
		if (con == null) {
			init(file);
			con = DriverManager.getConnection(url, user, password);
		}
		return con;
	}

	// Methode für die Verbindung zur DB; Uebergabe mit Parameterfile
	public static Connection getConnection() throws IOException,
			ClassNotFoundException, SQLException {
		return getConnection(FILE);
	}

	// Verbindung zur DB schliessen
	public static void closeConnection() {
		try {
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
		}
	}

	private static void init(String fileName) throws IOException,
			ClassNotFoundException {
		try {
			// DB Verbindungsparameter laden
			URL file = ConnectionManager.class.getResource(fileName);
			if (file == null)
				throw new IOException(FILE + " nicht gefunden!");

			InputStream in = file.openStream();
			Properties p = new Properties();
			p.load(in);
			in.close();

			driver = p.getProperty("driver");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");

			// JDBC-Treiber laden
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("JDBC-Treiber nicht gefunden!");
		}
	}
}
