package com.basic.lambda;

import java.util.ArrayList;
import java.util.List;

public class ReverseListUsingRecursion {

   /*
   * Recursive method to reverse a list
   */
   static void reverse(List<String> list) {
      // check if list is empty
      if (list.size() == 0) {
         return;
      }
      // remove first element
      String element = (String) list.remove(0);
      // call this method again
      reverse(list);
      // add element to the list
      list.add(element);
   }

   public static void main(String[] args) {
      // create an empty list to reverse
      List<String> list = new ArrayList<>();
      // add elements
      list.add("Google");
      list.add("Facebook");
      list.add("Youtube");
      list.add("Whatsapp");
      list.add("Instagram");
      System.out.println("Before reversing...");
      System.out.println(list);
      // call recursive method
      reverse(list);
      System.out.println("After reversing...");
      System.out.println(list);
   }
}