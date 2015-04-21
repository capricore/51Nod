package algorithm;

import java.util.Scanner;

public class LengthOfN {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		double length = 1;
		for (int i = 1; i <= n; i++) {
			length += Math.log10(i);
		}
		System.out.println((int)length);
	}
}
