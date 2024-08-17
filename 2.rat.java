import java.util.*;
class Rat{
	
	static int find(int r,int unit,int array[]){
		int sum=0;
		if(array.length==0)
			return -1;
		else{	
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
			if(sum>=(r*unit))
				return (i+1);	
		}
		return 0;
		}		
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rats (r): ");
		int r=sc.nextInt();
		System.out.println("Enter the no. of units for each rat (unit): ");
		int unit=sc.nextInt();		
		System.out.println("Enter the no. of houses (array): ");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter units of food in each house: ");
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}	
		int ans=find(r,unit,array);	
		if(ans==-1)	
			System.out.println("Array is null");
		else if(ans==0)
			System.out.println("food is not sufficeient");		
		else
			System.out.println("No. of houses :"+ans);					
	
	}
}	
