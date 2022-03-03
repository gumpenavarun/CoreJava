package main.strings;

import java.util.ArrayList;
import java.util.List;

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
		removeElement();
		
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
	
	
	public static void removeElement() {
		List<String> removeList = new ArrayList<String>();
		removeList.add("a");
		removeList.add("b");
		removeList.add("c");
		
		for (int i = 0; i < removeList.size(); i++) {
			
			if(removeList.get(i).contains("a")) {
				removeList.remove(i);
			}
			System.out.println(removeList.get(i));
		}
		
		
	}

}
