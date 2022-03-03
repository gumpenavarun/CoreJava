package main;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class PackageTest {

	Package pp = new Package();
	@Test
	void dupIntSum(){
		
		List<Integer> duplistt = new ArrayList<Integer>();
		duplistt.add(10);
		duplistt.add(20);
		duplistt.add(35);
		duplistt.add(10);
		System.out.println(duplistt);
		Optional<Integer> oi = Optional.of(65);
		Optional<Integer> nn= pp.dupIntSum(duplistt); 
		assertEquals(oi, nn);
	}
	
	@Test
	void reverseString() {
		String s="cherry";
		String rev="yrrehc";
		assertEquals(rev, pp.revString(s));
	}
	
	@Test
	void calNums() {
		ArrayList< Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		assertEquals(list.size(), pp.calNums(3));
	}


}
