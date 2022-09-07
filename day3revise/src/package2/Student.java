package package2;

// In this approach we shifted the local variables to class
// so that the variables are considered as instance variables
// now roll,name and marks are instance variables
// To access this instance variable in main, we have to 
// create an object of the Student class
// main is a static method and a static method cannot access
// non static members as roll,name and marks are non static
// The way out is create an object of Student class and
// access the instance variables
public class Student {
	int roll=1;
	String name="Ram";
	int marks=80;
	
	
	public static void main(String[] args) {
	//System.out.println(roll); //Cannot make a static reference to the non-static field roll
	//System.out.println(name);//Cannot make a static reference to the non-static field name
	//System.out.println(marks);
	Student stud=new Student(); // So we create an object of Student
	// class as above 
	System.out.println(stud.roll);
	System.out.println(stud.name);
	System.out.println(stud.marks);
	}

}
