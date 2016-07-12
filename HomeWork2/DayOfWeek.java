package Task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Valodik on 03.07.2016.
 It displays the day of the week for the number of the day */
public class DayOfWeek {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ââåäèòå íîìåğ äíÿ íåäåëè: ");
        int day = Integer.parseInt(reader.readLine()); // We get the number of days from the console

        String [] week = {"Ïîíåäåëüíèê", "Âòîğíèê", "Ñğåäà", "×åòâåğã", "Ïÿòíèöà", "Ñóááîòà", "Âîñêğåñåíüå"};
        // We create an array and makes it the week

        if ((day > 7) || (day < 1)) { //Check for input range
            System.out.println("Ââåäåí íåâåğíûé äåíü íåäåëè. Ïîïğîáóéòå åùå ğàç.");
        } else
        System.out.println(week[day-1]); //Displays day of the week
    }
}
