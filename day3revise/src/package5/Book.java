package package5;

public class Book {
private int bookId;
private String bookTitle;
private float price;

// Parameterless constructor/default constructor
Book(){
	bookId=0;
	bookTitle=" ";
	price=0;
	System.out.println("I am the default constructor!!!!");
}
// Parameterised constructor
Book(int id, String title, float prc){
	bookId=id;
	bookTitle=title;
	price=prc;
	System.out.println("I am the parameterized constructor");
	
}


void setBookDetails(int id,String title, float prc)
{
	bookId=id;
	bookTitle=title;
	price=prc;
	
}
void displayBookDetails() {
	System.out.println("The details for the book");
	System.out.println("BOOK ID -:"+bookId);
	System.out.println("BOOK TITLE -:"+bookTitle);
	System.out.println("BOOK PRICE -:"+price);
	
}
}
