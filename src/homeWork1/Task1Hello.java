package homeWork1;

import java.util.Scanner;

public class Task1Hello {
	public static void main(String[] args) {
		System.out.print("Введите имя: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine(); // Считываем строку целиком
		System.out.println("Привет, " + text + "!");
	}
}