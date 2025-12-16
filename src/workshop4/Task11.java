package workshop4;



import java.io.FileReader;
import java.io.IOException;

public class Task11 {
	public static void readData() throws IOException{
		FileReader fr = new FileReader("java.txt");
		System.out.println(fr.read());
		fr.close();
	}
	
	public static void main(String[] args) {
		try {
			readData();
		} catch (Exception e) {
			System.out.println("Cannot read data");
		}finally {
			System.out.println("program ended");
		}
	}
}