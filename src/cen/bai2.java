package cen;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a= ");
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			int tich = (a * i);
			System.out.println(a + " * " + i + " = " + tich);
		}
	}
}
