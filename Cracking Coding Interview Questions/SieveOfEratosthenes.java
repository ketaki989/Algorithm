package CCI;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static boolean[] sieveOfEratosthenes(int max){
		boolean[] flags = new boolean[max+1];
		Arrays.fill(flags, true);
		int count = 0 ;
		
		int prime = 2;
		while(prime < Math.sqrt(max)){
			crossoff(flags, prime);
			prime = getNextPrime(flags, prime); 
		}
		return flags;
	}
	
	
	public static void crossoff(boolean[] flags, int prime){
		for(int i = prime*prime; i < flags.length; i+=prime){
			flags[i] = false;
		}
	}
	
	public static int getNextPrime(boolean[] flags, int prime){
		int next = prime + 1;
		while(next < flags.length && !flags[next]){
			next++;
		}
		return next;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int maxElement = sc.nextInt();
		boolean[] primeArray = sieveOfEratosthenes(maxElement);
		System.out.println("Prime Numbers are :");
		for(int i = 0 ; i < primeArray.length; i++){
			if(primeArray[i] == true){
				System.out.println(primeArray[i]+" Index:"+i);
			}
		}
	}
}
