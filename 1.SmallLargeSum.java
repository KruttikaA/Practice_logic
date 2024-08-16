/*Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second largest element from the even location with the second largest element from an odd location?
Rules:
a. All the array elements are unique.
b. If the length of the array is 3 or less than 3, then return 0.
c. If Array is empty then return zero.

Sample Test Case 1:
Input:
6
3 2 1 7 5 4
Output:
7

Explanation: The second largest element in the even locations (3, 1, 5) is 3. The second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 4 is 7. So the answer is 7.

Sample Test Case 2:
Input:
7
4 0 7 9 6 4 2
Output:
10*/

/*OPTIMIZED
import java.util.*;

class Smalllarge {

    int SmallLargeSum(int arr[]) {
        if (arr.length <= 3) {
            return 0;
        } else {
            int[] evenIndices = new int[(arr.length + 1) / 2];
            int[] oddIndices = new int[arr.length / 2];
            int evenIndex = 0, oddIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    evenIndices[evenIndex++] = arr[i];
                } else {
                    oddIndices[oddIndex++] = arr[i];
                }
            }

            Arrays.sort(evenIndices);
            Arrays.sort(oddIndices);

            int secondLargestEven = evenIndices[evenIndices.length - 2];
            int secondLargestOdd = oddIndices[oddIndices.length - 2];

            return secondLargestEven + secondLargestOdd;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Smalllarge obj = new Smalllarge();
        int result = obj.SmallLargeSum(arr);
        System.out.println(result);
    }
}
*/

import java.util.*;
class Smalllarge{

	int SmallLargeSum(int arr[]){
		if(arr.length<=3){
			return 0;
		}else{	
			int arr1[],arr2[];
			if(arr.length%2==0){
				arr1=new int[(arr.length/2)];
				arr2=new int[(arr.length/2)];
			}else{
				arr2=new int[(arr.length/2)];
				arr1=new int[(arr.length/2)+1];	
			}
			
			int k=0;
			for (int i=0;i<=arr.length-2;i=i+2){
				arr1[k]=arr[i];
				k++;
			}
			for(int i=0;i<arr1.length;i++){
				for(int j=0;j<arr1.length-i-1;j++){
					if(arr1[j+1]<arr1[j]){
						int temp=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp;
					}
				}
			}
			
			

			k=0;
			for (int i=1;i<arr.length;i=i+2){
				arr2[k]=arr[i];
				k++;
			}
			for(int i=0;i<arr2.length;i++){
				for(int j=0;j<arr2.length-i-1;j++){
					if(arr2[j+1]<arr2[j]){
						int temp=arr2[j];
						arr2[j]=arr2[j+1];
						arr2[j+1]=temp;
					}
				}
			}
			
			return (arr1[arr1.length-2]+arr2[arr2.length-2])	;			
			
		}
	
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Smalllarge obj=new Smalllarge();
		int result=obj.SmallLargeSum(arr);
		System.out.println(result);
	}
}
