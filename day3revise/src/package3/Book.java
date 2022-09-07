package package3;

public class Book {
// bookId,bookTitle and bookPrice are instance variables,attributes
int bookId;
String bookTitle;
float bookPrice;

// setBookDetails, displayBookDetails are member methods
// we created a parameterized setDetails method
void setBookDetails(int id,String title, float price) {  
	bookId=id;
	bookTitle=title;
	bookPrice=price;
}
void displayBookDetails() {
	System.out.println(bookId);  //1
  	System.out.println(bookTitle); //Java
    System.out.println(bookPrice); //340.56
}

public static void main(String[] args) {
	Book b1=new Book(); 
	b1.setBookDetails(1,"Java",500.56f);
	b1.displayBookDetails();
	System.out.println("------------------------");
	Book b2=new Book();
	b2.setBookDetails(2,"HTML",300);
	b2.displayBookDetails();  
	
	}

}
