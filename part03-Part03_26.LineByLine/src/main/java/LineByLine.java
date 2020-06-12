
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String msg = scanner.nextLine();
            String[] split = msg.split(" ");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);

            }
            if (msg.equals("")) {
                break;
            }
        }

    }
}
