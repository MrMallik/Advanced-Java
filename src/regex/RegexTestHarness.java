package regex;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.print("Enter regex : ");

            Pattern pattern =
                    Pattern.compile(sc.nextLine());

            System.out.print("Enter input string to search: ");

            Matcher matcher =
                    pattern.matcher(sc.nextLine());

            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text" +
                                " \"%s\" starting at " +
                                "index %d and ending at index %d.%n",
                        matcher.group(),
                        matcher.start(),
                        matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found.");
            }
            System.out.println();
        }
    }
}
