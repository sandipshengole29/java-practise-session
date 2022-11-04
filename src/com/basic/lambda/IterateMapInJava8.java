package com.basic.lambda;

import java.util.HashMap;
import java.util.Map;


public class IterateMapInJava8 {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A1", 1);
		map.put("A2", 2);
		map.put("B11", 11);
		map.put("B22", 22);
		map.put("C111", 111);
		map.put("C222", 222);
		map.put("D1111", 1111);
		map.put("D2222", 2222);
		
		System.out.println("Itegrating map without stream: ");
		for (Map.Entry<String, Integer> data : map.entrySet()) {
			if(data.getValue() % 2 == 0) {
				System.out.println(data.getKey() +"="+ data.getValue());
			}
		}
		
		System.out.println("Itegrating map with stream: ");
		map.entrySet().stream().filter(entry -> entry.getValue() %2==0).forEach(System.out::println);
	}
}
