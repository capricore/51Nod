package algorithm;

import java.util.Scanner;

public class LastNum {
	
	static int calculate(int n, int x){
		if (x == 2 || x == 3 || x == 7 || x == 8) {
			n = (n % 4) ==0 ? 4 : n % 4;
			int c = 1;
			for (int i = 1; i <= n; i++) {
				c = c*x;
			}
			return c%10;
		}else if (x == 0) {
			return 0;
		}else if (x == 5 || x == 6 || x == 1) {
			return x; 
		}else if (x == 4 || x == 9) {
			n = (n % 2) ==0 ? 2 : n % 4;
			int c = 1;
			for (int i = 1; i <= n; i++) {
				c = c*x;
			}
			return c%10;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a = n % 10;
		System.out.println(calculate(n, a));
		cin.close();
	}
}

