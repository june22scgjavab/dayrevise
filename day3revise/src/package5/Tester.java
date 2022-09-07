package package5;

public class Tester {

	public static void main(String[] args) {
	Book book1=new Book(); // The parameterless constructor will be invoked
    book1.displayBookDetails();// We are not executing the setBookDetails
	Book book2=new Book(2,"CSS3",500); // The parameterised constructor is called
	book2.displayBookDetails();
	// I want to change all the details of book2 , so which one I should use constructor
	// or setBookDetails() method or I can use any one of this
	// Why setBookDetails() and why not constructor?
	//book2=new Book(3,"DBMS",800);
	// Is the above line changing the details of the book object created in line 8 or
	//to be more specific , is it same object whose data we are changing?
	// No ... In line 13 a new object got created and the object which got created in line8
	// is longer used by the code
	book2.setBookDetails(3, "DBMS",800);
    book2.displayBookDetails();
	}

}
