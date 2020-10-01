package Array;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********Bubble Sort************");
		System.out.println("Enter no of element:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		//Pass...
		for(int i = 0 ; i < n ; i++){
			//comparing and swapping...
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(arr[i]);
		}
	}
}
