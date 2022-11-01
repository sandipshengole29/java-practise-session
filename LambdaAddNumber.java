package com.basic.lambda;

@FunctionalInterface
interface AddNumber{
	public int addition(int a, int b);
}

public class LambdaAddNumber {
	public static void main(String args[]) {
		AddNumber an = (a,b) -> a + b;
		
		int addition1 = an.addition(10, 20);
		System.out.println("addition1: " + addition1);
		
		int addition2 = an.addition(32, 43);
		System.out.println("addition2: " + addition2);
	}
}
