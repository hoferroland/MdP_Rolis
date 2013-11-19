package DbConnectTest;

import static org.junit.Assert.*;
import DbConnect.ConnectionManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConnectionManagerTest {
	
	private static final String FILE = "/dbparam.txt";
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static Connection con;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void init() {
		
		
		
		String strdrv = p.getProperty("driver");
		assertEquals(strdrv, "org.hsqldb.jdbc.JDBCDriver");
		
	//	driver = p.getProperty("driver");
	//	url = p.getProperty("url");
	//	user = p.getProperty("user");
	//	password = p.getProperty("password");
		
		
	}
	
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
