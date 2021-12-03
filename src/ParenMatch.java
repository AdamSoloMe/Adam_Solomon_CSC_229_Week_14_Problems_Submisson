
import java.util.*;
import java.util.Scanner;
public class ParenMatch {
    public static void main(String[] args) {
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParenthesis Matching");
        System.out.print("Enter a parenthesized expression: ");
        line = scan.nextLine();
        boolean flag = true;

        for (int i = 0; i < line.length() && flag; i++) {
            String character = line.substring(i, i + 1);
            if (character.equals(("("))) {
                s.push(character);
            } else if (character.equals(")")) {
                if (s.empty()) {
                    System.out.println("there is an extra parentheses");
                    flag = false;
                } else {
                    s.pop();
                }
            }
        }
        if (flag) {
            if (s.empty()) {
                System.out.println("they are matched");
            }
            else {
                System.out.println("More left ones");
            }
        }
// loop to process the line one character at a time
// print the results
    }
}