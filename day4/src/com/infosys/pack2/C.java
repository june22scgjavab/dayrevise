package com.infosys.pack2;

import com.infosys.pack1.A;

public class C {
public void display() {
	A a=new A();
	//System.out.println(a.i); i is a private member of class A
	//System.out.println(a.j); default member are not
	// accessible outside the package
	//System.out.println(a.k); k is a protected member 
	// and A and C dont have any inheritance relationship and they are in
	// different packages
	System.out.println(a.l); // l is a public member of the class A
}
}
