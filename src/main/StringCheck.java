package main;

public class StringCheck {
public static void main(String[] args) {
	var s="abc";
	System.out.println((((char)s.chars().skip(s.length()-1).findFirst().getAsInt())+"").toUpperCase());
	System.out.println(((char)(s.chars().skip(s.length()-3).findFirst().getAsInt()-32)));
}
	
}
