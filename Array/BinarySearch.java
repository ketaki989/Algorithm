package Array;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = 0;
		System.out.println("Enter size of array :");
		int n = sc.nextInt();
		int end = n-1;
		
		//declaring an array...
		int arr[] = new int[n];
		
		//In binary search the array must be sorted...
		System.out.println("Enter element in sorting order :");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to be found :");
		int item = sc.nextInt();
		
		//calculate the middle element of array...
		int mid = (start + end)/2;
		while(start <= end){
			//if item < mid element search in less part of array 0 to mid-1...
			if(arr[mid] == item){
				System.out.println("Element found at "+(mid+1)+" position...");
				break;
			}
			if(item < arr[mid]){
				end = mid - 1;
				mid = (start + end)/2;
			}
			//if item > mid then start = mid + 1 search in right part... 
			else{
				start = mid + 1;
				mid = (start + end)/2;
			}
			if(start > end){
				System.out.println("Element not found!!!!");
			}
		}
	}

}
