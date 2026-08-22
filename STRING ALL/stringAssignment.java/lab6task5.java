import java.util.Scanner;

public class lab6task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 1. Remove the "Upside Down:" prefix if it's included in the input string
        if (input.startsWith("Upside Down: ")) {
            input = input.substring(13);
        } else if (input.startsWith("Upside Down:")) {
            input = input.substring(12);
        }

        String hawkins = "";

        // 2. Loop through each character of the encoded message
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Special mapping rules table
            if (ch == '^') {
                hawkins += 'v';
            } else if (ch == '3') {
                hawkins += 'e';
            } else if (ch == '@') {
                hawkins += 'a';
            } else if (ch == '_') {
                hawkins += ' ';
            } 
            // Alphabet wrap-around rule
            else if (ch == 'z') {
                hawkins += 'a';
            } 
            // Standard +1 ASCII shift for lowercase letters ('a' through 'y')
            else if (ch >= 'a' && ch <= 'y') {
                hawkins += (char) (ch + 1);
            } 
            // Fallback for any unexpected character
            else {
                hawkins += ch;
            }
        }

        // 3. Print the formatted result
        System.out.println("Hawkins: " + hawkins);
    }
}