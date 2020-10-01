package Array;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".............Insertion Sort...........");
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		int temp, j;
		for(int i = 1; i < n; i++){
			temp  = arr[i];
			for(j = i-1; j>=0 && arr[j]>temp; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		System.out.println("Sorted Elements:");
		for(int i = 0 ; i < n ; i++){
			System.out.print(" "+arr[i]);
		}
	}
}