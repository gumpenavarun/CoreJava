package automatic.type.promotions;

public class Test {
public static void main(String[] args) {
	int x =10;
	float f1=20;
	float f2= x+f1;
	System.out.println(f2);
	
	byte b1= 50;
	byte b2= 127;
	byte b3= (byte) (b1+b2);
	System.out.println(b3);
	
	String s= "varun";
	String s1 =  new String("varun");
	String s3= s1==s ? "cool" : "what";
	System.out.println(s3);
	
	int a=10;
	int b=20;
	float f= 5f;
	System.out.println(f/0);
	System.out.println(-0.0/0);
	
	byte c1= 10;
	byte c2= 20;
	byte c3= (byte) (126+2);
	char ch1 = 'a';
	char ch2 = 'b';
	char ch3 = (char) (ch1+'b');
	
	int i=20;
	float ff = 20f;
	float jj =  (i+ff);
	
	
	System.out.println(jj);
	
	
	}
}
