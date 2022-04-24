package com.edu;

import java.util.function.Predicate;

public class GreaterNumberUsingPredicate {

	public static void main(String[] args) {
		Predicate<Integer>gt=(i)->i>10;
		System.out.println("Is my number is greater than 10");
		boolean b=gt.test(20);
		if(b) {
			System.out.println("Yes, Greater than 10");
		}
		else {
			System.out.println("No, Less than 10");
		}	

	}

}
