package Array;

import java.util.*;
public class SelectionSort {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(".............Selection Sort...........");
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		//sorting function
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Elements:");
		for(int i = 0 ; i < n ; i++){
			System.out.println(arr[i]);
		}
	}
}
