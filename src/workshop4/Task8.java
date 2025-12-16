package workshop4;

public class Task8 {
	
	    public static void main(String[] args) {
	        try {
	            try {
	                int a = 10 / 0;
	            } catch (ArithmeticException e) {
	                System.out.println("Inner catch: " + e);
	            }

	            int[] arr = new int[2];
	            System.out.println(arr[5]);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Outer catch: " + e);
	        }
	    }
	}



