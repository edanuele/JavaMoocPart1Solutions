
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highestAge = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitted = input.split(",");
            for (int i = 1; i < splitted.length; i++) {
                if (Integer.valueOf(splitted[1]) > highestAge) {
                    highestAge = Integer.valueOf(splitted[1]); 
                }
            }
        }
        System.out.println("Age of the oldest: " + highestAge);


    }
}
