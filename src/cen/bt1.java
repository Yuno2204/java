package cen;

import java.util.Scanner;

public class bt1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên sinh viên: ");
		String so1 = scanner.nextLine();
		System.out.println("Điểm: ");
		float so2 = scanner.nextFloat();
		System.out.println(so1 + " có điểm = " + so2);
		scanner.close();
	}
}
