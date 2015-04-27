package algorithm;

import java.util.Scanner;

public class LRS {
	
	static String dp(String s, String d, int[][] re){

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= d.length(); j++) {
				if (s.charAt(i-1) == d.charAt(j-1)) {
					re[i][j] = re[i-1][j-1]+1;

				}else {
					re[i][j] = Math.max(re[i-1][j], re[i][j-1]);
				}
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = s.length()-1,j = d.length()-1; i >= 0 && j >= 0; ) {
				if (s.charAt(i) == d.charAt(j)) {
					stringBuilder.append(s.charAt(i));
					i--;
					j--;
				}else {
					if (re[i][j+1] > re[i+1][j]) {
						i--;
					}else {
						j--;
					}
				}
		}
		return stringBuilder.toString();
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
			re[i][0] = 0;
		}
		for (int i = 0; i <= d.length(); i++) {
			re[0][i] = 0;
		}
		String result = dp(s, d, re);
		for (int i = result.length()-1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		cin.close();
	}
}
