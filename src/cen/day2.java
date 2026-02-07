package cen;

import java.util.Scanner;

public class day2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a= ");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("day la 1 ko phai so nguyen to");
		} else {
			int dem = 0;
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					dem++;
				}

			}
			if (dem == 2) {
				System.out.println(a + " la so nguyen to");
			} else {
				System.out.println(a + " ko la so nguyen to");
			}
		}
	}

}
