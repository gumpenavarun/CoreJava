package main.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import main.Package;

public class CamelCase {
	
	public static void main(String[] args) {
//		String[] s ;
//		Scanner sc = new Scanner(System.in);
//		String ss = sc.nextLine();
//		s= ss.split(" ");
//		camelCaseLine(s);
		
		String fullName = "varun chakravarthy gumpena is good java developer and working as a software engineer";
		String[] temp;
		temp = fullName.split(" ");
		//CamelCase.makeLastCharCapital(temp);
		//CamelCase.camelCaseLine(temp);
		System.out.println("---------");
		//CamelCase.firstAndLastCapital(temp);
		//removeElement();
		stringArray();
		
	}
	public static void camelCaseLine(String[] s) {
		
		for (int i = 0; i < s.length; i++) {
			s[i]=	s[i].substring(0,1).toUpperCase()+s[i].substring(1).toLowerCase();
			System.out.print(s[i]+" ");
		}
		
	}
	public static void makeLastCharCapital(String[] name) {
		
		for (int s = 0; s < name.length; s++) {
			name[s] = name[s].substring(0,name[s].length()-1).toLowerCase()+name[s].substring((name[s].length() - 1), name[s].length()).toUpperCase();
			System.out.println(name[s]+" ");
		}
		
	}
	
	public static void firstAndLastCapital(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()!=1) {
				s[i]=	s[i].substring(0,1).toUpperCase()+s[i].substring(1, s[i].length()-1).toLowerCase()+s[i].substring((s[i].length() - 1), s[i].length()).toUpperCase();
			}else {
				s[i]=s[i].toUpperCase();
			}
			
			System.out.println(s[i]);
		}
	}
	
	
	
	static class A{
		static void m1() {
			System.out.println("M1 from class A");
		}
		static void m2() {
			m1();
			System.out.println("m2 Method from Class A");
		}
	}
	
	public static void removeElement() {
		List<String> removeList = new ArrayList<String>();
		removeList.add("aa");
		removeList.add("baa");
		removeList.add("ca");
		
		for (int i = 0; i < removeList.size(); i++) {
			
			if(removeList.get(i).contains("aaaa")) {
				removeList.remove(i);
			}
			System.out.println(removeList.get(i));
		}
	}
	
	public static void stringArray() {
		int [] myIntArray = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); 
		int [] myInt = IntStream.range(1, 100).toArray();
		String[] sArray = new String[5];
		sArray[0]= "hi";
		sArray[1] = sArray[0].toUpperCase();
		sArray[2] = sArray[0].replace("hi", "Hello");
		sArray[3] = sArray[0].substring(1);
		for(String s: sArray) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(myIntArray));
		System.out.println((myInt[56]));
	}
	

}
