package algorithm;

import java.util.Scanner;

public class Metrix {
	
	static long dp(long[][] re, long[][] num, int n){
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				re[i][j] = Math.max(re[i-1][j], re[i][j-1]) + num[i][j];
			}
		}
		return re[n-1][n-1];
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long[][] num = new long[n][n];
		long[][] re = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j] = cin.nextInt();
			}
		}
		re[0][0] = num[0][0];
		for (int i = 1; i < n; i++) {
			re[0][i] =  re[0][i-1] + num[0][i];
		}
		for (int i = 1; i < n; i++) {
			re[i][0] = re[i-1][0] + num[i][0];
		}
		System.out.println(dp(re,num,n));
	}
}
