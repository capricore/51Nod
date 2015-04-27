package algorithm;

import java.util.Scanner;

public class PackageOneDimen {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] w = new int[n];
		int[] p = new int[n];
		int[] v = new int[m+1];
		for (int i = 0; i < n; i++) {
			w[i] = cin.nextInt();
			p[i] = cin.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = m; j >= w[i]; j--) {
				v[j] = Math.max(v[j], v[j-w[i]]+p[i]);
			}
		}
		System.out.println(v[m]);
		cin.close();
	}

}
