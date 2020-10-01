// Problem statement : Unbounded Knapsack and Rod cutting problem....
package DP;
import java.util.*;
public class UnboundedKnapsack {
	
	public static int unboundedKnapsack(int val[], int nums[],int sum, int n){
	
//		int t[] = new int[sum+1];
//		
//		for(int i = 0 ; i < sum+1; i++){
//			for(int j = 0 ; j < n; j++){
//				if(nums[j] <= i){
//					t[i] = Math.max(val[j] + t[i - nums[j]], t[i]);
//				}
//			}
//		}
//		
//		for(int i = 0 ; i < sum+1; i++){
//			System.out.print(t[i] + " ");
//		}

		int t[][] = new int[n+1][sum+1];
		
		for(int i = 0 ; i < n+1; i++){
			for(int j = 0 ; j < sum+1; j++){
				if(i == 0 || j == 0){
					t[i][j] = 0;
				}
				else if(nums[i-1] <= j){
					t[i][j] = Math.max(val[i-1] + t[i][j - nums[i-1]], t[i-1][j]); 
				}else{
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][sum];
	}
	public static void main(String args[]){
		
		int W = 100;
		int price[] = {10,30,20};
		int arr[] = {5,10,15};
		int n = price.length;
		System.out.println("Unbounded elements total price:"+unboundedKnapsack(price, arr, W, n));
		
	}
}
