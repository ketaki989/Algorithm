package CCI;

import java.util.*;
public class PalindromePermutation {

	private static boolean canPermutation(String str) {
		int[] char_count = new int[128];
		for(int i = 0 ; i < str.length(); i++){
			char_count[str.charAt(i)]++;
		}
		int count = 0;
		for(int i = 0 ; i < 128; i++){
			count = count + char_count[i]%2;
		}
		
		return count <= 1;
	}
	
	public static void main(String args[]){
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(canPermutation(str)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
