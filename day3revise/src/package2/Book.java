package package2;

public class Book {
// bookId,bookTitle and bookPrice are instance variables,attributes
int bookId;
String bookTitle;
float bookPrice;

// setBookDetails, displayBookDetails are member methods
void setBookDetails() {  
	bookId=1;
	bookTitle="Java";
	bookPrice=340.56f;
}
void displayBookDetails() {
	System.out.println(bookId);  //1
  	System.out.println(bookTitle); //Java
    System.out.println(bookPrice); //340.56
}

public static void main(String[] args) {
	Book b1=new Book(); // This line can be further broken into two statements
	// Book b1=null; ===> b1 is a reference variable of Book type and it can store the address of the newly created 
	//book object and currently we are writing as null which means it is not pointing to any object
	//b1=new Book();
	b1.setBookDetails();
	b1.displayBookDetails();
	System.out.println("------------------------");
	Book b2=new Book();
	b2.setBookDetails();
	b2.displayBookDetails();  
	
	}

}
