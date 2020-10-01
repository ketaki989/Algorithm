package DP;

import java.util.Arrays;

public class EqualSumPartition {
	
	public static boolean canPartition(int nums[]){
		
		int sum = Arrays.stream(nums).sum();
		int n = nums.length;
		
		if(sum%2 != 0){
			return false;
		}
		
		sum = sum/2;
		boolean t[][] = new boolean[n+1][sum+1];
		
		for(int i = 0 ; i < n+1 ; i++){
			t[i][0] = true;
		}
		
		for(int i = 1 ; i < sum+1 ; i++){
			t[0][i] = false;
		}
		
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < sum+1; j++){
				t[i][j] = t[i-1][j];
				if(j >= nums[i-1]){
					t[i][j] = t[i-1][j] || t[i-1][j - nums[i-1]];
				}
			}
		}
		return t[n][sum];
	}
	public static void main(String args[]){
		int arr[] = {1,1};
		System.out.println(canPartition(arr));
	}
}
