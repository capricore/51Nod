package algorithm;

import java.util.Scanner;

public class TriangleMaxSum {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[][]	 num = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				num[i][j]= cin.nextInt();
			}
		}
		
		for (int i = n-2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				num[i][j] = Math.max(num[i+1][j], num[i+1][j+1]) + num[i][j];
			}
		}
		System.out.println(num[0][0]);
		cin.close();
	}
}
