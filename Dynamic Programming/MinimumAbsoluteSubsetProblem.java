package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAbsoluteSubsetProblem {
	
	public static int minimumSubset(int nums[], int sum){
		
		int n = nums.length;
		boolean t[][] = new boolean[n+1][sum+1];

		for(int i = 0 ; i < n+1; i++){
			t[i][0] = true;
		}
		
		for(int j = 1; j < sum+1; j++){
			t[0][j] = false;
		}
		
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < sum+1; j++){
				t[i][j] = t[i-1][j];
				if(j >= nums[i-1]){
					t[i][j] = t[i-1][j] || t[i-1][j - nums[i-1]];
				}
			}
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j = n;
		for(int i = 1 ; i < (sum+1)/2; i++){
			if(t[j][i] == true){
				arr.add(i);
			}
		}
		System.out.println(Arrays.asList(arr));
		
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.size(); i++){	
			min = Math.min(min, sum - 2*arr.get(i));
			System.out.println(min);
		}
		return min;
	}
	public static void main(String args[]){
		
		int arr[] = {1,2,7};
		int sum = Arrays.stream(arr).sum();
		
		System.out.println(minimumSubset(arr, sum));
	}
}
