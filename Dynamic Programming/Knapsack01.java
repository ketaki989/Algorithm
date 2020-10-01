package DP;

import java.util.Arrays;

public class Knapsack01 {

	public static int max(int a, int b){
		return (a > b) ? a : b;
	}

	// RESCURSION FUNCTION: 
	// Time Complexity : O(2^N) 
	// Space Complexity: O(1)
	public static int knapsack(int[] wt, int[] v, int w, int n) {
		if( n == 0 || w == 0){
			return 0;
		}
		if(wt[n-1] > w){
			return knapsack(wt, v, w, n-1);
		}
		else{
			return max(v[n-1] + knapsack(wt, v, w - wt[n-1], n-1), knapsack(wt, v, w, n-1));
		}
	}
	
	//Recursion + memoize = Top Down Approach..
	//Time Complexity: N * W
	//Space Complexity: N * W
	public static int dpKnapsack(int[] wt, int[] v, int w, int n, int[][] t){
		
		if(n == 0 || w == 0){
			return 0;
		}
	
		if(t[n][w] != 0){
			return t[n][w];
		}
		
		if(wt[n-1] > w){
			return t[n][w] = knapsack(wt, v, w, n-1);
		}
		else{
			return t[n][w] = max(v[n-1] + knapsack(wt, v, w - wt[n-1], n-1), knapsack(wt, v, w, n-1));
		}
	}
	//BottomUp Approach Dynamic Programming
	//Time Complexity & Space Complexity: O(N*M) 
	public static int bottomupKnapsack(int[] wt, int[] v, int w, int n){
		int t[][] = new int[n+1][w+1];
		for(int i = 0; i < n+1; i++){
			for(int j = 0 ; j < w+1; j++){
				if( i == 0 || j == 0)
					t[i][j] = 0;
				
				else if(wt[i-1] <= j){
					t[i][j] = max(v[i-1] + t[i-1][j - wt[i-1]],  t[i-1][j]);

				}else{
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][w];
	}

	public static void main(String args[]){
		
		int wt [] = new int[] {10, 20, 30};
		int v[] = new int[] {60, 100, 120};
		int n = v.length;
		int w = 50;
		int t[][] = new int[n+1][w+1];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < w; j++){
				t[i][j] = -1;
			}
		}
		System.out.println("Max Profit:"+knapsack(wt, v, w, n));
		System.out.println("Max Profit Top Down DP(Recursion + Memoize):"+ dpKnapsack(wt, v, w, n, t));
		System.out.println("Max Profit Bottom Up DP:"+bottomupKnapsack(wt, v, w, n));
	}
}
