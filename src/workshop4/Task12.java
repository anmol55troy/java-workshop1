package workshop4;

public class Task12 {
 public static int checknum(int num) {
	try {
		return 10/num;
	} catch (Exception e) {
		System.out.println("Exception");
		return 0;
	}finally {
		System.out.println("Finally block executed");
		return -1;
	}
 }
 
 public static void main(String[] args) {
	System.out.println(checknum(0));
}
}

