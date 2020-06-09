
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ave = 0;
        int posNum = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            if (num > 0) {
                ave = ave + num;
                posNum = posNum +1;
            }
            
        }
        
        if (posNum > 0) {
            double result = 1.0 * ave / posNum;
            System.out.println(result);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
