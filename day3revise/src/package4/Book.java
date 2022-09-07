package package4;

// declaring the members as private , wont allow the 
// members to be accessed outside the class
public class Book {
private int bookId;
private String bookTitle;
private float price;

// In the methods we are not using any access
// specifier/modifier like private or public
// so in that case the default modifier is default
// or package specific modifier
// default means the members are accessible in the same 
// package as we will see that both Tester and Book class
//are in same package so Tester will be able to access the
// Book class's setBookDetails and displayBookDetails
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
