package com.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Package extends AbstractClass {

	int age;
	String name;
	String lastName;

	public Package() {
		this.age = 29;
		this.name = "varun";
	}

	public Package(int a, String s) {
		this.age = a;
		this.name = s;
	}

	public static void main(String args[]) {
		Package obj1 = new Package();
		Package obj2 = new Package(56, "Steve");
		System.out.println("Object 1 -> " + obj1.name + " " + obj1.age);
		System.out.println("Object 2 -> " + obj2.name + " " + obj2.age + "\n");

		obj2.m1();
		obj2.m2();

		String output = obj2.change();
		System.out.println(output);
		System.out.println(obj1.S);

		List<String> l1 = Arrays.asList("orange", "orange", "green", "green", "blue", "black", "white");
		List<Integer> l2 = Arrays.asList(1, 2, 3, 5, 9, 2, 11);
		System.out.println(l1);
		Map<String, Integer> collect = l1.parallelStream()
				.collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));
		// Map<String, Long> collect =
		// l1.parallelStream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
		Integer l3 = l2.stream().collect(Collectors.summingInt(Integer::intValue));

		Collections.reverse(l2);
		for (int i = 0; i < 3; i++) {
			System.out.println(l2.get(i));
		}
		System.out.println(l3);
		System.out.println(collect);
		int count = 0;

		for (Iterator iterator = l1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if (string.equals("orange")) {
				count++;
			}

		}
		System.out.println("Orange count in list are " + count);

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String i : l1) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
			/*
			 * if(l1.contains(i)) { hm.put(i,j+1); }else { hm.put(i, 1); }
			 */
		}
		for (Map.Entry<String, Integer> val : hm.entrySet()) {
			// System.out.println("Element " + val.getKey() + " " + "occurs"+ ": " +
			// val.getValue() + " times");
		}

		int a = obj1.rec(5);
		System.out.println(a);
		System.out.println();
		int b = obj1.incrementOne(99);
		System.out.println(b);

		obj1.dupString("vaattrunn");

		int sumof = obj1.sumOfNumber(451);
		System.out.println(sumof);

		int sumOfNatural = obj1.sumOfNaturalNo(10);
		System.out.println(sumOfNatural);

		int d2b = obj1.d2b(10);
		System.out.println(d2b);
		int fib = obj1.fib(11);
		System.out.println(fib);
		String s = obj1.revString("varun");
		System.out.println(s);

		obj1.sumArray();

		List<String> firstName = new ArrayList<String>();
		firstName.add("Element 1");
		firstName.add("Element 2");
		firstName.add("Element 3");
		printList(firstName);
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(23);
		numList.add(20);
		printList(numList);
		
		//Print list in reverse order
//		for (int i = 1; i <= firstName.size(); i++) {
//			System.out.println(firstName.get(firstName.size() - i));
//
//		}
		
		String ss= "varun chakravarthy";
		findDuplicateCharsWithCount(ss);
		
		
		
	}
	
	public static <E> void printList(List<E> Object) {
		Object.forEach(System.out::println);
		
	}
	

	@Override
	void m1() {
		System.out.println("M1 method from base class");

	}

	@Override
	String change() {
		// TODO Auto-generated method stub
		return "change method base class";
	}

	@Override
	int add() {
		return 0;
	}

	int rec(int a) {
		if (a == 1) {
			return 1;
		}
		System.out.println(a);
		return a * rec(a - 1);
	}

	// print 1 to 100
	int incrementOne(int a) {
		if (a > 1 && a < 100) {
			System.out.println(a);
			return incrementOne(a + 1);
		} else {
			return a;
		}
	}
	/*
	 * void m2() { System.out.println("M2 Method From Package class"); }
	 */

	public static void findDuplicateCharsWithCount(String str) {
		System.out.println("Duplicates in- " + str);
		char[] strArr = str.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (char c : strArr) {
			// We don't need to count spaces
			if (c == ' ')
				continue;
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}
		// Displaying the map values
		Set<Map.Entry<Character, Integer>> countSet = countMap.entrySet();
		for (Map.Entry<Character, Integer> entry : countSet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
			}
		}
	}

	public void dupString(String str) {
		System.out.println("Entered String " + str);
		int count = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					System.out.println("Here is the Duplicate char " + c[i]);
					count++;
				}

			}

		}
		System.out.println("Total no of duplicate chars in give array is " + count);
	}

	int sumOfNumber(int n) {
		if (n == 0 || n < 0) {
			return 0;
		} else {
			return (n % 10) + sumOfNumber(n / 10);
		}
	}

	int sumOfNaturalNo(int n) {
		if (n == 0)
			return 0;
		return n + sumOfNaturalNo(n - 1);
	}

	int d2b(int n) {
		if (n == 0)
			return 0;
		return (n % 2) + 10 * d2b(n / 2);
	}

	int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}

	String revString(String s) {
		if (s.isEmpty())
			return s;
		return revString(s.substring(1)) + s.charAt(0);

	}

	Character everyCharUpper(String s) {
		if (s.isEmpty())
			return ' ';
		if (Character.isUpperCase(s.charAt(0)))
			return s.charAt(0);
		return everyCharUpper(s.substring(1, s.length()));
	}

	void sumArray() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int n = a.length + 1;
		int total = n * (n + 1) / 2;
		for (int v : a) {
			sum = sum + v;
		}
		System.out.println(sum);
		total = total - sum;
		System.out.println(total);
	}

}