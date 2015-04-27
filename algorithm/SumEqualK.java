package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SumEqualK {
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum = cin.nextInt();
		int n = cin.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = cin.nextInt();
		}
		Arrays.sort(num);
		boolean flag = true;
		for (int i = 0,j = n-1; i < j ;) {
			if (num[i] + num[j] == sum) {
				System.out.println(num[i]+" "+num[j]);
				flag = false;
				i++;
				j--;
			}else if (num[i] + num[j] > sum) {
				j--;
			}else {
				i++;
			}
		}
		if (flag) {
			System.out.println("No Solution");
		}
		cin.close();
	}

}
