import java.util.Scanner;
public class Task1Hello {
public static void main(String [] args) {
System.out.print("������� ���: ");
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine(); //��������� ������ �������
System.out.println("������, " + text + "!");
}
}