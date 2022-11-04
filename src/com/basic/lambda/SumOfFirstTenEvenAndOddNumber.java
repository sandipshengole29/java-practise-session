package com.basic.lambda;

import java.util.stream.Stream;

public class SumOfFirstTenEvenAndOddNumber {

	public static void main(String args[]) {
		System.out.println("Even Number: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n%2 == 0).forEach(System.out::println);
		
		System.out.println("Sum of Even Number: ");
		int sumOfFirstTenEvenNumber = Stream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n%2 == 0).mapToInt(n -> n).sum();
		System.out.println(sumOfFirstTenEvenNumber);
		
		System.out.println("Odd Number: ");
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n%2 != 0).forEach(System.out::println);
		
		System.out.println("Sum of Odd Number: ");
		int sumOfFirstTenOddNumber = Stream.of(1,2,3,4,5,6,7,8,9,10).filter(n -> n%2 != 0).mapToInt(n -> n).sum();
		System.out.println(sumOfFirstTenOddNumber);
	}
}
