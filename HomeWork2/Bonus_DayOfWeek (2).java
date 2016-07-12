package Task2Bonus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * Created by Valodik on 06.07.2016.
 It displays the day of the week for the number of the day */
public class DayOfWeek {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������� ����� ��� ������: ");
        int day = Integer.parseInt(reader.readLine()); // We get the day from the console
        System.out.println("������� ����� ������: ");
        int month = Integer.parseInt(reader.readLine()); // We get the month from the console
        System.out.println("������� ���: ");
        int year = Integer.parseInt(reader.readLine()); // We get the year from the console
        
        int century = (int) Math.round(year/100);
        int dayOfWeek = (int)((day + Math.round(1/5*(13*(month-2) - 1)) + year + Math.round(year/4) -2*century + 777) % 7);
        
        String [] week = {"�����������", "�������", "�����", "�������", "�������", "�������", "�����������"};
        // We create an array and makes it the week

        if ((dayOfWeek > 7) || (dayOfWeek < 1)) { //Check for input range
            System.out.println("�������� ���� ������.");
        } else
        System.out.println(week[dayOfWeek-1]); //Displays day of the week
	}
}
