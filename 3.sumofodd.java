//sum of odd integers in array
import java.util.*;
class Solution{
	int SumOddIntegers(int arr[],int n){
		int sum=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==1)
				sum=sum+arr[i];	
		}
		return sum;
	}
}
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of Array: ");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}	
		Solution obj=new Solution();
		int sum=obj.SumOddIntegers(arr,n);
		System.out.println("Sum is " +sum);			
	}
}
