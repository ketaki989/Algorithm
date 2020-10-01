package CCI;
import java.util.*;
public class OneAway {
	//Time Complexity O(n)
	public static int DPfibonacci(int n){ 

		//Time Complexity; O(N*N) = O(N^2)
		for(int i = 0; i < n ;i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				int k = i+j;
			}
		}
		
		for(int i = 0 ; i < n; i++){
			int k = i*i;
		}
		
		for(int j = 0; j< n ; j++){
			int a = j /j+1;
		}
		return 0;
		
	
	} 
	
	public static void fibo(int n){
		if(n == 0 || n==1)
			System.out.println(n);
		// 0 1 1 2 3 
		// a b c
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2; i < n ; i++){
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

	public static void main(String args[]){
			System.out.println("Fibonacci: "+DPfibonacci(5));
			fibo(5);
	}
}
