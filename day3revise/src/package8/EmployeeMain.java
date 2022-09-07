package package8;

public class EmployeeMain {
// In this example we created our own default constructor and parameterised
// constructor . So in line 8 , while creating the object, default constructor
// got invoked and in line 11 , parameterized constructor got invoked
	
	public static void main(String[] args) {
	Employee emp=new Employee();
	
	emp.displayDetails();
	Employee emp2=new Employee(2,"Soham","Manager","Marketing",34000);
	emp2.displayDetails();
	Employee emp3=new Employee("Ritesh","Manager","Sales",32000);
	emp3.displayDetails();
	}

}
