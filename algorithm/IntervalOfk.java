package algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class IntervalOfk {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int sum = cin.nextInt();
		int[] num = new int[n+1];
		int[] dp = new int[n+1];
		for (int i = 1; i <= n; i++) {
			num[i] = cin.nextInt();
			dp[i] = dp[i-1] + num[i];
		}
		dp[0] = 0;
		boolean flag = true;
		int l= 0,r =0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = n; i >= 0; i--) {
			hashMap.put(dp[i], i);
		}
		for (int i = 1; i <= n; i++) {
			if (dp[i] - sum == 0) {
				if (hashMap.get(dp[i]-sum) + 1 <= i) {
					if (flag) {
						l = hashMap.get(dp[i]-sum)+1;
						r = i;
					}else {
						if (hashMap.get(dp[i]-sum)+1 < l) {
							l = hashMap.get(dp[i]-sum)+1;
							r = i;
						}
						if (hashMap.get(dp[i]-sum)+1 == l && i<r) {
							r = i;
						}
					}
					flag = false;
				}
			}
			if (hashMap.containsKey(dp[i] - sum)) {
				if (hashMap.get(dp[i]-sum) + 1 <= i) {
					if (flag) {
						l = hashMap.get(dp[i]-sum)+1;
						r = i;
					}else {
						if (hashMap.get(dp[i]-sum)+1 < l) {
							l = hashMap.get(dp[i]-sum)+1;
							r = i;
						}
						if (hashMap.get(dp[i]-sum)+1 == l && i<r) {
							r = i;
						}
					}
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("No Solution");
		}else {
			System.out.println(l+" "+r);
		}
		cin.close();
	}
}
