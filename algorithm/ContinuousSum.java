package algorithm;

import java.util.Scanner;

public class ContinuousSum {
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = (int) Math.sqrt(2*n+1/4)-1/2;
		boolean flag = false;
		for (int i = m; i >= 2; i--) {
			if ((i % 2 == 1) && (n % i == 0)) {
				System.out.println(n/i - i/2);
				flag = true;
			}else if(i % 2 == 0) {
				int b = n % i;
				if (b*2 == i) {
					System.out.println(n/i - i/2 + 1);
					flag = true;
				}
			}
		}
		if (!flag) {
			System.out.println("No Solution");
		}
	}
}
