package week6.test;
import week6.tutorial.DatabaseConnection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
	DatabaseConnection db;
	@BeforeEach
	void setup() {
		 db = new DatabaseConnection();
		System.out.println("Setup");
	}
	
	@Test
	void tryConnectingDatabase() {
		boolean output = db.connectToDatabase();
		assertTrue(output);
		
	}
	@Test
	void testReadData() {
		db.connectToDatabase();
		db.disconnectConnection();
		String output = db.readData("Viva");
		String excepted = "Data:Viva";
//		assertNotNull(output);
//		assertEquals(excepted, output);
		
		assertAll(
		   ()-> assertNotNull(output) ,
		   ()-> assertEquals(2,2),
		   ()-> assertEquals(excepted, output)
		   );
		
	
	}

}
