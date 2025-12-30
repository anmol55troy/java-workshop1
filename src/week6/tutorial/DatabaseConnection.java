package week6.tutorial;

public class DatabaseConnection {
	public boolean status = false;
	
	public boolean connectToDatabase() {
		status = true;
		return status;
	}
 
	public String readData(String data) {
		if(status) {
			return "Data:"+data;
		}
		return null;
	}
	
	public boolean disconnectConnection() {
		status = false;
		return status;
	}
}
