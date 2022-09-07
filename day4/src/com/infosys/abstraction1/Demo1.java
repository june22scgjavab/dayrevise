package com.infosys.abstraction1;

public class Demo1 {
// So in the below code we are not able to see how equalsIgnoreCase is
// implemented in the String class. It is because of Abstraction
// So in this we only know:
	//1) The method name
	//2) The return type of the method which is boolean
	//3) The parameter which is a String
// We are not able to see how equalsIngnore case is implemented
	public static void main(String[] args) {
		String str="welcome";
		if(str.equalsIgnoreCase("welcome")) {
			System.out.println("Yes equal");
		}
		else {
			System.out.println("Not equal");
		}

	}

}
