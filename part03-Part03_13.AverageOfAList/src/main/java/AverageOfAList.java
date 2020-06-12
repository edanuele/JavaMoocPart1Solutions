
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
        int input = Integer.valueOf(scanner.nextLine());
        if (input == -1) {
            break;
        }
        list.add(input);
        }
        int sum = 0;
        int num = 0;
        for (Integer number: list) {
            sum = sum + number;
            num++;
        }
        System.out.println("Average: " + (1.0*sum / num));
    }
}
