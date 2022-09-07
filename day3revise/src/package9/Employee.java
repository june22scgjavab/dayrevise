package package9;

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
// and the instance variable are not initialised with the value being passed
// as parameters and so they get default value

Employee(int id,String name, String designation,String department, float basic){ // parameterised
	id=id;
	name=name;
	designation=designation;
	department=department;
	basic=basic;
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
