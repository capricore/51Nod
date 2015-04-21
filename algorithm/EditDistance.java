package algorithm;

import java.util.Scanner;

public class EditDistance {
	
	static int dp(String s, String d, int[][] re){
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= d.length(); j++) {
				if (s.charAt(i-1) == d.charAt(j-1)) {
					re[i][j] = re[i-1][j-1];
				}else {
					re[i][j] = Math.min(re[i-1][j], Math.min(re[i-1][j-1], re[i][j-1]))+1;
				}
			}
		}
		return re[s.length()][d.length()];
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s = cin.next();
		String d = cin.next();
		int[][] re = new int[s.length()+1][d.length()+1];
		if (s.length() == 0) {
			System.out.println(d.length());
		}
		if (d.length() == 0) {
			System.out.println(s.length());
		}
		for (int i = 0; i <= s.length(); i++) {
			re[i][0] = i;
		}
		for (int i = 0; i <= d.length(); i++) {
			re[0][i] = i;
		}
		System.out.println(dp(s,d,re));
	}
}
