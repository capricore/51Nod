package algorithm;

import java.util.Scanner;

public class LIS {
	
	static long dp(long[] re, int[] num){
		long maximun = 0;
		long count = 0;
		for (int i = 0; i < num.length; i++) {
			long max = 0;
			for (int j = 0; j < i; j++) {
				if (num[j] < num[i]) {
					max = Math.max(max, re[j+1] + 1);
					if (max == re[j+1]+1) {
						if (max == maximun) {
							count = (count+1)%1000000007;
						}else if (max > maximun) {
							maximun = max;
							count = 1;
						}
					}

				}
			}
			re[i+1] = Math.max(max, re[i+1]);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.nextLine();
		int[] num = new int[n];
		long[] re = new long[n+1];
		re[0] = 0;
		for (int i = 1; i < n+1; i++) {
			re[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			num[i] = cin.nextInt();
		}
		System.out.println(dp(re,num));
		cin.close();
	}
}
