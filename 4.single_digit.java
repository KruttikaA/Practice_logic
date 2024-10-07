//convert number to single digit number

import java.util.*;
class Solution{
	int ConvertToSingleDigit(int n){
		while(n>9){
			if(n%2==0)
				n=(n-2)/2;
			else
				n=n/2;	
		}
		return n;
	}
}
class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
	System.out.println("Enter digit");
	int n=sc.nextInt();
	Solution obj=new Solution();
	int digit=obj.ConvertToSingleDigit(n);
	System.out.println("Single digit number is : "+digit);
  }	
}
