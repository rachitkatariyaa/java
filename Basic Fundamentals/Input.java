import java.util.*;

public class Input {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // for input
        System.out.print("Enter a word: ");
        String input = sc.next();
        System.out.println("Input: " + input);

        // Consume the newline character
        sc.nextLine();

        // for printing an entire string line
        System.out.print("Enter a line: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        // for printing an integer value
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}
