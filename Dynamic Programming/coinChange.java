package DP;

import java.util.Arrays;

public class coinChange {

	public static int coinChange(int coins[], int sum, int n){
		 
		int t[][] = new int[n+1][sum+1];
		for(int i = 0 ; i < n+1; i++){
			t[i][0] = 1;
		}
		
		for(int j = 1 ; j < sum+1; j++){
			t[0][j] = 0;
		}
		
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < sum+1; j++){
				if(coins[i-1] <= j){
					t[i][j] = t[i-1][j] + t[i][j - coins[i-1]];
				}else{
					t[i][j] = t[i-1][j];
				}
			}
		}
		for(int i = 0; i < n+1; i++){
			for(int j = 0; j < sum+1; j++){
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
		return t[n][sum];
	}
	public static void main(String[] args) {
		int coins[] = {1,2,5};
		int n = coins.length;
		int sum = 11;
		
		System.out.println(Arrays.toString(coins));
		System.out.println(coinChange(coins, sum, n));
	}

}
