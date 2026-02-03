package cen;

import java.util.Scanner;

public class bt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chiều dài: ");
		Float a = scanner.nextFloat();
		System.out.println("Chiều rộng: ");
		float b = scanner.nextFloat();
		float chuvi = (a + b) * 2;
		System.out.println("Chu vi = " + chuvi);
		float dientich = a * b;
		System.out.println("Diện tích = " + dientich);
		float cnn = Math.min(a, b);
		System.out.println("Cạnh nhỏ nhất  = " + cnn);
		scanner.close();
	}
}
