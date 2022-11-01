package com.basic.lambda;

@FunctionalInterface
interface SquareIt{
	public int squareNumber(int n);
	
	public static int staticSquare(int a) {
		return a*a;
	}
	
	public default int defaultSquare(int b) {
		return b*b;
	}
}

public class LambdaSquareIt {
	public static void main(String args[]) {
		SquareIt si = n -> n*n;
		int square1 = si.squareNumber(5);
		System.out.println("square1: " + square1);
		
		int square2 = SquareIt.staticSquare(6);
		System.out.println("square2: " + square2);
		
		int square3 = si.defaultSquare(7);
		System.out.println("square3: " + square3);
	}
}
