package workshop4;



import java.io.FileReader;

public class Task13 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("java.txt");
			
		}catch (Exception e) {
			System.out.println("File not found");
		}
	}

}
