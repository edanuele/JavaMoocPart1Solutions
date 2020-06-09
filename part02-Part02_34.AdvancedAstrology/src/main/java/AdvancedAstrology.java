
public class AdvancedAstrology {

    public static void printStars(int number) {
        int first = 0;
        while (first < number) {
            System.out.print("*");
            first++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int space = 0;
        while (space < number) {
            System.out.print(" ");
            space++;
        }
    }

    public static void printTriangle(int size) {
        int triangle = 0;
        int space = size;
        while (triangle < size) {
            space--;
            printSpaces(space);
            triangle++;
            printStars(triangle);
        }
    }

    public static void christmasTree(int height) {
        int triangle = 0;
        int space = height;
        while (triangle < height) {
            space--;
            printSpaces(space);
            triangle = (triangle + 1) * 2 - 1;
            printStars(triangle);
            
            
            
            
            
            
            
        }
        //for the stand
        int heightStand = 2;
        while (triangle < heightStand) {
            space = space - 2;
            printSpaces(space);
            space = space + 2;
            
            printStars(3);
            triangle++;
            
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
