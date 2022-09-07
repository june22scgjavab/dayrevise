package package4;

public class Tester {

	public static void main(String[] args) {
	Book book=new Book();
	//Tester and Book are two different classes
	// To access the book class members we have
	// to create an object of book
	//book.bookId=1; //The field Book.bookId is not visible
	book.setBookDetails(1,"Java", 500);
	book.displayBookDetails();
	}

}
