
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highestAge = 0;
        String oldestPerson = "idk yet";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] name = input.split(",");
            for (int i = 0; i < name.length; i++) {
                if (Integer.valueOf(name[1]) > highestAge) {
                    highestAge = Integer.valueOf(name[1]);
                    oldestPerson = name[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestPerson);


    }
}
