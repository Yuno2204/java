package cen;

import java.util.Scanner;

public class bt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cạnh: ");
		Float a = scanner.nextFloat();
		double tt = Math.pow(a, 3);
		System.out.println("Thể tích = " + tt);
		scanner.close();
	}

}
