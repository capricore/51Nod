package algorithm;

import java.util.Scanner;

public class Plalindrome {
	

	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s = cin.next();
		int len = s.length();
		int[] re = new int[len+1];
		for (int i = len; i >= 0; i--) {
			re[i] = len-1-i;
		}
		boolean[][] isPal = new boolean[len][len];
		for (int i = len-1; i >= 0; i--) {
			for (int j = i; j <= len-1; j++) {
				if (s.charAt(i) == s.charAt(j) && (j-i<2 || isPal[i+1][j-1])) {
					isPal[i][j] = true;
					re[i] = Math.min(re[i], re[j+1]+1);
				}
			}
		}
		System.out.println(re[0]+1);
	}
}
