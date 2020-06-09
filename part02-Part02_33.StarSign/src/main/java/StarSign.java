
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int first = 0;
        while (first < number) {
            System.out.print("*");
            first++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int second = 0;
        while (second < size) {
            printStars(size);
            second++;
        }
    }

    public static void printRectangle(int width, int height) {
        int third = 0;
        while (third < height) {
            printStars(width);
            third++;
        }
    }

    public static void printTriangle(int size) {
        int fourth = 0;
        while (fourth < size) {
            fourth++;
            printStars(fourth);
        }
    }
}
