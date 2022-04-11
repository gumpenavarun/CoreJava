package automatic.type.promotions;
import java.lang.Math;

import access.modifiers.Example;
public class D  {
	
	static int x=10;
	static int b=10;
	
	static int m1(double base,double exponent) {
		return (int) Math.pow(base,exponent);
	}
	
	static void m2() {
		int a=10;
		System.out.println(a);
		
		m3();
	}
	
	static void m3() {
		 b +=10;
		System.out.println("b  "+b);
	}
	
	
	
	
	
public static void main(String[] args) {
	Example e = new Example();
// 	System.out.println(e.a); //  a has private in Example class
//	System.out.println(e.b); //  b is not public in Example class
//	System.out.println(e.c); // c has protected access in Example class
	System.out.println(e.d);  // D can be accessed since its public 
	
	AccessingAccessModifiers ac = new AccessingAccessModifiers();
//	System.out.println(ac.c); // c has protected access in Example
	System.out.println(ac.d); //  D can be accessed since its public 
	int b = 0;
	System.out.println(e);
	 e = new Example();
	 System.out.println(e);
	// int x=m1(2.2,2.);
		System.out.println(x);
		System.out.println(b);
		m3();
}
}
