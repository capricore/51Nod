package algorithm;

import java.util.Scanner;

public class ModP {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int p = cin.nextInt();
		long c = 1;
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result = (i*result) % p;
		}
		System.out.println(result);
	}
}
