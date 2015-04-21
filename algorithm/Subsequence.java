package algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class Subsequence {
	
	static void dp(long[] re, int[] num){
		HashMap<Integer, Integer> used = new HashMap<>();
		for (int i = 1; i <= num.length; i++) {
			if (used.containsKey(num[i-1])) {
				int flag = used.get(num[i-1]);
				if (re[i-1]*2 - re[flag-1] < 0) {
					re[i] = (re[i-1]*2 - re[flag-1] + 1000000007)%1000000007;
				}
				else {
					re[i] = (re[i-1]*2 - re[flag-1])%1000000007;
				}
			}else {
				re[i] = (re[i-1]*2 + 1)%1000000007;
			}
			used.put(num[i-1],i);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		cin.nextLine();
		int[] num = new int[n];
		long[] re = new long[n+1];
		re[0] = 0;
		for (int i = 0; i < n; i++) {
			num[i] = cin.nextInt();
		}
		dp(re,num);
		System.out.println(re[n]);
	}
}
