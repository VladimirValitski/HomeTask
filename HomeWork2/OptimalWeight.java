package Task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 02.07.2016.
 Determining optimal weight*/
public class OptimalWeight { /* Determining optimal weight */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������� ��� ���� � ��: ");
        int growth = Integer.parseInt(reader.readLine()); // We get the height from the console
        System.out.println("������� ��� ��� � ��: ");
        int weight = Integer.parseInt(reader.readLine()); // We get the weight from the console

        int optimalWeight = growth - 100;

        if (weight < optimalWeight) { // Compare the weight with optimum
            int result = optimalWeight - weight;
            System.out.println("��� ���������� ���������� �� " + result + " ��"); // Output result
        }
        else
        if (weight > optimalWeight) {
            int result =  weight - optimalWeight;
            System.out.println("��� ���������� �������� �� " + result + " ��"); // Output result
        }
        else
        if (weight == optimalWeight) {
            System.out.println("�����������! � ��� ��������� ���."); // Output result
        }
        }
}
