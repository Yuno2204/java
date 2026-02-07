package cen;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a= ");
		int a = scanner.nextInt();
		int[] b = new int[a];

		System.out.println("Nhap thanh tu trong mang = ");
		for (int i = 0; i < a; i++) {
			b[i] = scanner.nextInt();

		}
		int max = b[0];
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			max = Math.max(max, b[i]);
			min = Math.min(min, b[i]);
		}
		System.out.println(max);
		System.out.println(min);
		Arrays.sort(b);

		System.out.println(Arrays.toString(b));

	}
}
