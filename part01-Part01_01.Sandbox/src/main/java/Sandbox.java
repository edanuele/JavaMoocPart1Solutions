import java.util.Scanner;
public class Sandbox {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Input an integer number less than ten billion:");
         int number = Integer.valueOf(scanner.nextLine());
         
         if (number < 0) {
             System.out.println("Number of digits in the number: are you high bro");
         } else if (number >= 0 && number <= 9) {
             System.out.println("Number of digits in the number:1");
         } else if (number >= 10 && number <= 99) {
             System.out.println("Number of digits in the number:2");
         } else if (number >= 100 && number <= 999) {
             System.out.println("Number of digits in the number:3");
         } else if (number >= 1000 && number <= 9999) {
             System.out.println("Number of digits in the number:4");
         } else if (number >= 10000 && number <= 99999) {
             System.out.println("Number of digits in the number:5");
         } else if (number >= 100000 && number <= 999999) {
             System.out.println("Number of digits in the number:6");
         } else if (number >= 1000000 && number <= 9999999) {
             System.out.println("Number of digits in the number:7");
         } else if (number >= 10000000 && number <= 99999999) {
             System.out.println("Number of digits in the number:8");
         } else if (number >= 100000000 && number <= 999999999) {
             System.out.println("Number of digits in the number:9");
         } else if (number >= 1000000000 && number <= 9999999999) {
             System.out.println("Number of digits in the number:10");
         } else if (number >= 10000000000) {
             System.out.println("Number of digits in the number:BELOW 10 billion lang, GAGO");
         } 
         
        
    }
}
