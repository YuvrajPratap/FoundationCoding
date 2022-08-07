import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = in.nextLine();
        System.out.println(palindrome(input));
    }

    static String palindrome(String str) {
        String reverse = "";

        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);
        if (str.equalsIgnoreCase(reverse))
            return "TRUE";
        else
            return "FALSE";
    }
}
