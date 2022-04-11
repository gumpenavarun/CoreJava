package access.modifiers;

public class Sample {

	public static void main(String[] args) {
		Example e = new Example();
		//System.out.println("a: "+e.a); // you wil not get "a" variable since its private
		System.out.println("b: "+e.b);
		System.out.println("c: "+e.c);
		System.out.println("d: "+e.d);
		
		
	}
}
