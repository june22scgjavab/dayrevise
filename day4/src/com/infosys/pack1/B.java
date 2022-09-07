package com.infosys.pack1;

public class B {

	public void display() {
	A a = new A();
	// System.out.println(a.i); i is a private member of class a
	System.out.println(a.j); // j is a default member and
	// Both the classes A and B are in the same package
	// So default/package specific members are accessible
	System.out.println(a.k); // k is a protected member and
	// Both A and B are in the same package but dont have Parent child relationship
	//than also the protected member is accessible
	System.out.println(a.l); // l is public member of class A , so it is accessible
		
	}
}
