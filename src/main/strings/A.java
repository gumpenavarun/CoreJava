package main.strings;

import java.util.ArrayList;
import java.util.List;

public  class A {
	static int a;
	public static void main(String[] args) {
		int p;
		int i = 256;
		byte b = (byte)i;
		char ch1= 'a';
		char ch2 = 97;
		char ch3 = 118;
		int i1 = 98;
		int i2 = 'b';
		int in = 0101;
		char ch4 = (char)in;
		System.out.println(ch4);
		System.out.println(ch1+"\t"+ ch2+"\t"+i1+"\t"+i2+"\t"+ch3);
		System.out.println(a);
		System.out.println(b);
		int count=0;
		char chh= 65;
		System.out.println("------ chh"+chh);
		
		for (int j = 'a'; j <= 'z'; j++) {
			//String s=Character.toString(j);
			System.out.println(count +"- "+Character.toString(j).toUpperCase());
			count++;
		}
		List<String> num = new ArrayList<String>();
  	}

}
