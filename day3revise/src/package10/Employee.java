package package10;

public class Employee {
private int id;
private String name;
private String designation;
private String department;
private float basic;

//The parameters and instance variable are having the same name
// So in the constructor the parameter or the local variables will be 
// having the highest priority. So in the constructor basically the
// parameterised or local variables are assigned to themselves only.
// To get the solution of the same , we have to use this keyword.
// this represents the current object.
// So when we use this with the variables, it represents that the variables are
// associated with the current object

Employee(int id,String name, String designation,String department, float basic){ // parameterised
	this.id=id;
	this.name=name;
	this.designation=designation;
	this.department=department;
	this.basic=basic;
	System.out.println("I am the parameterized");
}



void displayDetails() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
	System.out.println(department);
	System.out.println(basic);
}
}
