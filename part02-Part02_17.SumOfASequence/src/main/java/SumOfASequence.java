
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number? ");
        int user = Integer.valueOf(scanner.nextLine());
        
        int add = 0;
        for (int i = 1; i <= user; i++) {
            add = add + i;
            
            
        }
       
       
        System.out.println("The sum is " + add);
        
    }
}
