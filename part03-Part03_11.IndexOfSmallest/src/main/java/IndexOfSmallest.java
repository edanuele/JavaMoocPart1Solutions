
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            } else {
                numbers.add(number);
            }
        }
        int smallest = numbers.get(0);
        int index = 0;
        for (int i = index; i < numbers.size(); i++) {
            int actualNumber = numbers.get(i);
            if (actualNumber < smallest) {
                smallest = actualNumber;

            }

        }
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            int actualNumber = numbers.get(i);
            if (smallest == actualNumber) {
                index++;
                System.out.println("Found at index: " + i);

            }
        }
    }
}
