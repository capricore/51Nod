package algorithm;

import java.util.Scanner;

public class MinDifference {
	

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] num = new int[n+1];
		int total = 0;
		for (int i = 1; i <= n; i++) {
			num[i] = cin.nextInt();
			total += num[i];
		}
		int[] dp = new int[total/2+1];
		for (int i = 1; i <= n; i++) {
			for (int j = total/2; j >= num[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-num[i]] + num[i]);
			}
		}
		System.out.println(Math.abs(total-dp[total/2]*2));
		cin.close();
	}
}
