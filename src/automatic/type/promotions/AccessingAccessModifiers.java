package automatic.type.promotions;

import access.modifiers.Example;

public class AccessingAccessModifiers extends Example {
	public static void main(String[] args) {
		Example a = new Example();
		System.out.println("a: "+a.d);
		
		AccessingAccessModifiers ac = new AccessingAccessModifiers();
		System.out.println(ac.c);
		System.out.println(ac.d);
		
	}
	
	
}
