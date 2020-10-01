package CCI;

import java.util.*;
public class SievesPrimesNo {
	
	public static boolean prime(int num){
		if(num < 2){
			return true;
		}
		int sqrt = (int)Math.sqrt(num);
		for(int i = 2; i <= sqrt; i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int data = sc.nextInt();
		if(prime(data)){
			System.out.println("Prime...");
		}else{
			System.out.println("Not Prime...");
		}
	}

}
