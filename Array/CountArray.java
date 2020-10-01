package hackerrank;

import java.util.Scanner;

public class CountArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[];
		while(n --> 0){
			int size = sc.nextInt();
			arr = new int[size];
			for(int i = 0 ; i < size; i++){
				arr[i] = sc.nextInt();
			}
			
			int x = sc.nextInt();
			
			int start = 0;
			int count = 0;
			int end = size - 1;
			int mid = (start + end)/2;
			System.out.println("Mid: "+mid);
			while(mid >= start){
				System.out.println("Hello In");
				if(arr[mid] <= x){
					System.out.println("H1:"+arr[mid]);
					while(arr[mid+1] <= x){
						System.out.println("H1:"+arr[mid]+' '+mid+1);
						mid++;
					}
					System.out.println("Count: "+count);
					count++;
					mid--;
				}else{
					mid--;
				}
				System.out.println("C:"+count);

				System.out.println("mid:"+mid);
				System.out.println("Hello Out");
			}
			System.out.println("Count:"+count);
		}
	}

}
