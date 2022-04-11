package automatic.type.promotions;

public class AccessingStaticAndNonStatic {
	
	static int x=10;
	static int y=20;
	
	int a =30;
	int b=40;
	public static void main(String[] args) {
		int p =50;
		int q= 60;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	//	System.out.println("a "+a);
	//	System.out.println("b "+b);
		
	AccessingStaticAndNonStatic access = new AccessingStaticAndNonStatic();
	System.out.println(access.a);
	System.out.println(access.b);
	
	System.out.println("P "+p);
	System.out.println("q "+q);
	}

	
}
