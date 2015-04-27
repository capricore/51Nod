package algorithm;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		long[][] dp = new long[m][n];
		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			dp[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007;
			}
		}
		System.out.println(dp[m-1][n-1]);
		cin.close();
	}
}
