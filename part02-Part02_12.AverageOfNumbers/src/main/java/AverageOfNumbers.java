
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int average = 0;
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0 || num < 0) {
                average = average + num;
                numbers = numbers + 1;
            }
        }
        
        if (numbers > 0) {
            double result = 1.0 * average / numbers;
            System.out.println("Average of the numbers: " + result);
        }

    }
}
