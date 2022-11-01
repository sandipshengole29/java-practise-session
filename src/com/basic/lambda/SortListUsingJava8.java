package com.basic.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingJava8 {
	public static void main(String args[]) {
		//Remove sort the integers data in ascending order
		List<Integer> integersList = new ArrayList<>();
		integersList.add(12);
		integersList.add(2);
		integersList.add(21);
		integersList.add(23);
		integersList.add(1);
		integersList.add(99);
		integersList.add(4);
		integersList.add(56);
		System.out.println("Before Sort integersList: " + integersList);

		List<Integer> sortedNumberList1 = integersList.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sort sortedNumberList1: " + sortedNumberList1);
		
		List<Integer> sortedNumberList2 = integersList.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sort sortedNumberList2: " + sortedNumberList2);
		
		//Remove sort the string data in ascending order
		List<String> namesList = new ArrayList<>();
		namesList.add("dany");
		namesList.add("hello");
		namesList.add("sam");
		namesList.add("tina");
		namesList.add("anna");
		namesList.add("chris");
		namesList.add("tolu");
		System.out.println("Before Sort namesList: " + namesList);
		
		List<String> sortedNamesList1 = namesList.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sort sortedNamesList1: " + sortedNamesList1);
		
		List<String> sortedNamesList2 = namesList.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sort sortedNamesList2: " + sortedNamesList2);
		
		//Remove duplicates and sort the data in ascending order
		List<Integer> duplicateDataList = new ArrayList<>();
		duplicateDataList.add(12);
		duplicateDataList.add(4);
		duplicateDataList.add(21);
		duplicateDataList.add(23);
		duplicateDataList.add(99);
		duplicateDataList.add(99);
		duplicateDataList.add(4);
		duplicateDataList.add(21);
		System.out.println("Before removing duplicate from duplicateDataList: " + duplicateDataList);
		
		List<Integer> distinctDataList1 = duplicateDataList.stream().distinct().sorted((i1, i2) -> Long.compare(i2, i1)).collect(Collectors.toList());
		System.out.println("After Descending Sort distinctDataList1: " + distinctDataList1);
		
		List<Integer> distinctDataList2 = duplicateDataList.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("After Ascending Sort distinctDataList2: " + distinctDataList2);
		
		List<String> numberStringList = distinctDataList1.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println("converted number list into string list: " + numberStringList);
	}
}
