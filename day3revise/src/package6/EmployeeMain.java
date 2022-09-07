package package6;

public class EmployeeMain {
// In java we dont get garbage value but as the default constructor
// is called so it initialised the members with the default value
// For reference type like String , the default value is null
	// for int the default value is 0
	// float default value is 0.0
	
	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.displayDetails();
	}

}
