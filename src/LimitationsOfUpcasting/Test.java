package LimitationsOfUpcasting;

public class Test {
	public static void main(String[] args) {
		//Example e = new Sample();
		// e.m1();

//		Sample s = (Sample) e;
//		s.m1();
//		s.m2();
		Test.m3(new Sample());
		Test.m3(new Example());

	}
	
	
	static void m3(Example e) {
		e.m1();
		
		if(e instanceof Sample) {
		Sample s = (Sample) e;
		s.m2();
		}
	}

}
