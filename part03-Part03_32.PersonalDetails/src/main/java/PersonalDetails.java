
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "idk yet";
        int longestName = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] split = input.split(",");

            int length = split[0].length();
            

            if (longestName < length) {
                longestName = length;
                name = split[0];
                
            }
            

            if (Integer.valueOf(split[1]) > 0) {
                sum = sum + (Integer.valueOf(split[1]));
                count++;
            }
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
