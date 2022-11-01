package com.basic.lambda;

/*
Chantu and Bantu are the hostlers and like any other hostler have very less money with them. They promised their girlfriends, Rani and Sheena that they would give them N number of gifts on their birthday. The birthday is next week and Chantu and Bantu are trying to figure out a way to make them happy.


They went to a gift shop which consists of G number of gifts and now need your help to determine the minimum money they will have to arrange to buy N gifts. Once you tell them the amount of money required, they will plan out something to arrange for the money. Can you help them figure out the minimum money required to buy N gifts?


Example:

Number of gifts available in the shop, G = 8

Number of gifts to be bought, N = 3

The minimum amount of money Chantu Bantu have to spend to buy 3 gifts = 10 + 20 + 30 = 60




Input Format
The first line of input consists of number of test cases, T

The first line of each test case consists of number of gifts Chantu Bantu have to buy, N

The second line of each test case consists of number of gifts available in the shop, G

The thirds line of each test case consists of G space-separated integers representing the price of G gifts where the first integer represents the price of first gift and so on.



Constraints
1<= T <=10

1<= G <=100000

1<= N <=G

0<= Price of Gift <=10000000



Output Format
For each test case, print the minimum amount of money Chantu Bantu has to pay to buy the N gifts.

2
3
8
50 70 30 100 80 20 150 10
4
6
10 20 32 412 500 11
*/
import java.util.ArrayList;
import java.util.List;
public class CandidateCode {
	Integer[] prizeArray = null;
   String giftAmount = null;
   Integer boughtGift = 0; //N
   Integer availableGift = 0; //G

   public CandidateCode() {
	   super();
   }
   
   public CandidateCode(String giftAmount, Integer boughtGift, Integer availableGift){
      this.prizeArray = new Integer[availableGift];
      this.giftAmount = giftAmount;
      this.boughtGift = boughtGift;
      this.availableGift = availableGift;
   }

   public void getPrizeArray(){
      List<Integer> prizeList = new ArrayList<>();
      String[] prizeArray = this.giftAmount.split(" ");
      for(String s : prizeArray){
         prizeList.add(Integer.parseInt(s));
      }
      this.prizeArray = prizeList.toArray(new Integer[this.availableGift]);
   }
   
   public Integer[] getSortedArray(){
	   Integer temp = 0;
	   for(Integer i = 0; i < this.prizeArray.length; i++){
	      for(Integer j = i+1; j < this.prizeArray.length; j++){
	         if(this.prizeArray[i] > this.prizeArray[j]){
	            temp = this.prizeArray[i];
	            this.prizeArray[i] = this.prizeArray[j];
	            this.prizeArray[j] = temp;
	         }
	      }
	   }
	   return prizeArray;
   }

   public void getTotalAmount(Integer[] sortedPrizeArray){
	   Integer totalAmount = 0;
      for(Integer i = 0; i < sortedPrizeArray.length; i++){
         if(i < this.boughtGift){
            totalAmount = totalAmount + sortedPrizeArray[i];
         }
      }
      System.out.println(totalAmount);
   }

   public static void main(String args[] ) throws Exception {
	//Write code here
   CandidateCode cc1 = new CandidateCode("50 70 30 100 80 20 150 10", 3, 8);
   cc1.getPrizeArray();
   cc1.getTotalAmount(cc1.getSortedArray());
   
   CandidateCode cc2 = new CandidateCode("10 20 32 412 500 11", 4, 6);
   cc2.getPrizeArray();
   cc2.getTotalAmount(cc2.getSortedArray());
   
   // int T1N = 3;
   // int T1G = 8;
   // int[] T1prizeArray = new int[]{50,70,30,100,80,20,150,10};
   // int[] T1sortedPrizeArray = cc.getSortedArray(T1prizeArray);
   // cc.getTotalAmount(T1sortedPrizeArray, T1N);

   // int T2N = 4;
   // int T2G = 6;
   // int[] T2prizeArray = new int[]{10,20,32,412,500,11};
   // int[] T2sortedPrizeArray = cc.getSortedArray(T2prizeArray);
   // cc.getTotalAmount(T2sortedPrizeArray, T2N);
   }
}
