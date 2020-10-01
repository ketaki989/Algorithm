package CCI;

import java.util.Arrays;
import java.util.Scanner;

//For example, “abcd” and “dabc” are Permutation of each other
public class PermutationString {
	//BruteForce Approach...TC = O(N^2)
	//Here Arrays.sort uses QuickSort
	public static boolean calculatePermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		// Convert string char array
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		//Sort the characters...
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//Check whether they are equal...
		return Arrays.equals(ch1,ch2);
	}
	
	//Time complexity: O(n)
	public static boolean OptimalcalculatePermutation(String str1, String str2){
		int MAX_COUNT = 256;
		int count1[] = new int[MAX_COUNT];
		int count2[] = new int[MAX_COUNT];

		Arrays.fill(count1, 0);
		Arrays.fill(count2, 0);
		
		if(str1.length() != str2.length())
			return false;
		for(int i = 0 ; i < str1.length() && i < str2.length(); i++){
			count1[str1.charAt(i)]++;
			count2[str2.charAt(i)]++; 
		}
		return Arrays.equals(count1, count2);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		//Brute Force Solution...
		if(calculatePermutation(str1, str2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		//Optimal Solution...
		if(OptimalcalculatePermutation(str1, str2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}	
	}
}
