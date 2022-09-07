package package7;

public class Employee {
private int id;
private String name;
private String designation;
private String department;
private float basic;

Employee(){
	id=1;
	name="INFOSYS";
	designation="NOT KNOWN";
	department="NOT KNOWN";
	basic=1000;
}
void displayDetails() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
	System.out.println(department);
	System.out.println(basic);
}
}
