package algorithm;

import java.util.Scanner;

public class Package {
	
	static int dp(int[] w,int[] p,int n, int m, int[][] v){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (w[i-1] > j) {
					v[i][j] = v[i-1][j];
				}else {
					v[i][j] = Math.max(v[i-1][j], v[i-1][j-w[i-1]]+p[i-1]);
				}
			}
		}
		return v[n][m];
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] w = new int[n];
		int[] p = new int[n];
		int[][] v = new int[n+1][m+1];
		for (int i = 0; i < n; i++) {
			v[i][0] = 0;
		}
		for (int i = 0; i < m; i++) {
			v[0][i] = 0;
		}
		for (int i = 0; i < n; i++) {
			w[i] = cin.nextInt();
			p[i] = cin.nextInt();
		}
		System.out.println(dp(w, p, n, m, v));
	}
}
