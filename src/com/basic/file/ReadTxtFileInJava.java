package com.basic.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTxtFileInJava {
	public static void main(String args[]) {
		System.out.println("Program for reading file...");
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Sandip Data\\My Study\\My-Work\\java-practise-session\\src\\file.txt"))) {
			String readLine = bufferedReader.readLine();
			System.out.println("File Data: " + readLine);
		} catch (Exception e) {
			System.err.println("Exception occured while reading file in java:" + e);
		}
	}
}
