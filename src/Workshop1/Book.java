package Workshop1;

public class Book {
	String title;
	String author;
	int year;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
public static void main(String[] args) {
	Book b1 = new Book();
	b1.title = "The Great Gatsby";
	b1.author = "F. Scott Fitzgerald";
	b1.year = 1925;
	System.out.println(b1.toString());
}
}
