package com.basic.lambda;

public class SortArrayElements {
	private int[] prizeArray = new int[] {50,70,30,100,80,20,150,10};
	
	public SortArrayElements() {
		super();
	}
	
	public int[] getSortedArray(int[] inputArray) {
		int temp = 0;
		if(null != inputArray) {
			for (int i = 0; i<inputArray.length; i++) {
				for(int j = i+1; j < inputArray.length; j++) {
					if(inputArray[i] > inputArray[j]) {
						temp = inputArray[i];
						inputArray[i] = inputArray[j];
						inputArray[j] = temp;
					}
				}
			}
		}
		return inputArray;
	}
	
	public static void main(String args[]) {
		SortArrayElements sortArrayElements = new SortArrayElements();
		int inputArrayLength = sortArrayElements.prizeArray.length;
		int[] outputArray = new int[inputArrayLength];
		outputArray = sortArrayElements.getSortedArray(sortArrayElements.prizeArray);
		for (int i : outputArray) {
			System.out.println(i);
		}
	}
}
