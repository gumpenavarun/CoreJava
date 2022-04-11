package referenced;

public class ReferencedTypeConversion {
public static void main(String[] args) {
	Object obj1 = new Object();
	Object obj2 = new A();
	Object obj3 = new B();
	Object obj4 = new C();
	Object obj5 = new D();
	
	A a1 = new A();
	A a2 = new B();
	A a3 = new C();
	//A a4 = new D();
	
	//B b1 = (B)new A(); //Downcasting 
	B b2 = new B();
	B b3 = new C();
	//B b4 = new D();
	
	A a = new B();
	
	System.out.println(a instanceof A);
	System.out.println(a instanceof B);
	System.out.println(a instanceof C); //Why 
	System.out.println(b2 instanceof A);
	//System.out.println(a instanceof D);
	
	
	
	
	
}
}
