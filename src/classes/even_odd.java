package classes;

import java.util.Scanner;

public class even_odd {
    static String checkeven()
    {
        System.out.println("please enter a number to check if it's even or odd");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if (n % 2 == 0) {
            String result = "Even";
            return result;
        }
        else
            return "Odd";
    }
}
