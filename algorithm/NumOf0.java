package algorithm;

import java.util.Scanner;

public class NumOf0 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int count = 0;
		while(n/5 != 0){
			count += n/5;
			n /= 5;
		}
		System.out.println(count);
		cin.close();
	}
}
