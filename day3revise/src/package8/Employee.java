package package8;

public class Employee {
private int id;
private String name;
private String designation;
private String department;
private float basic;

Employee(){   // parameterless
	id=1;
	name="INFOSYS";
	designation="NOT KNOWN";
	department="NOT KNOWN";
	basic=1000;
	System.out.println("I am the default");
}


Employee(int id1,String name1, String desig,String dept, float bas){ // parameterised
	id=id1;
	name=name1;
	designation=desig;
	department=dept;
	basic=bas;
	System.out.println("I am the parameterized");
}

Employee(String name1, String desig,String dept, float bas){ // parameterised
	id=100;
	name=name1;
	designation=desig;
	department=dept;
	basic=bas;
	System.out.println("I am the parameterized without id being passed");
}



void displayDetails() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
	System.out.println(department);
	System.out.println(basic);
}
}
