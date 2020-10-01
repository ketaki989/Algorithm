// Count the total numbers of subset in array.
// eg. arr[] = {1,2,3,3};
// o/p = 3 {1,2,3}, {3,3}, {1,2,3}
package DP;

public class CountSubset {
	public static int countSubset(int nums[], int sum){
		
		int n = nums.length;

		int t[][] = new int[n+1][sum+1];
		for(int i = 0 ; i < n+1 ; i++){
			t[i][0] = 1;
		}
		for(int j = 1 ; j < sum+1; j++){
			t[0][j] = 0;
		}
		
		
		for(int i = 1; i < n+1; i++){
			for(int j = 1; j < sum+1; j++){
				if(j >= nums[i-1]){
					t[i][j] = t[i-1][j] + t[i-1][j - nums[i-1]]; 
				}else{
					t[i][j] = t[i-1][j];
				}
			}
		}
		return t[n][sum];
	}
	public static void main(String args[]){
		int arr[] = {1,2,3,3};
		int sum = 6;
		System.out.println(countSubset(arr, sum));
	}
}
