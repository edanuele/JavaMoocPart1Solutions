
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int numNum = 0;
        double ave = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            int user = Integer.valueOf(scanner.nextLine());
            if (user == -1) {
                break;
            }
            if (user > -1) {
                sum += user;
                numNum++;
                ave = 1.0* sum / numNum;
            }
            if (user % 2 == 0 && user > -1) {
                even++;
            } else {
                odd++;
            }
            
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numNum);
        System.out.println("Average: " + ave);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
