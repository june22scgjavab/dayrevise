package pacakge11;

public class Employee {
private int id;
private String name;
private String designation;
private String department;
private float basic;

Employee()
{
//System.out.println("Hello");
  /* id=1; 
  name="INFOSYS"; 
  designation="UNKNOWN"; 
  department="UNKNOWN";
  basic=1000; */ 
 
	this(1,"INFOSYS","UNKNOWN","UNKOWN",1000);  // Constructor call must be the first statement in a constructor
}
Employee(int id,String name, String designation,String department, float basic){ // parameterised
	//this();
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
