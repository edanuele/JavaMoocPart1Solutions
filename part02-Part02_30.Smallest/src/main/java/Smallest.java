
public class Smallest {

    public static int smallest(int number1, int number2) {
        int small = 0;
        if (number1 > number2) {
            small = number2;
        } else {
            small = number1;
        }

        return small;
    }

    public static void main(String[] args) {
        int result = smallest(7, 2);
        System.out.println("Smallest: " + result);
    }
}
