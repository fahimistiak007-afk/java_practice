k.n/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two input strings
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Optional safety: If input includes "String1:" or "String2:" prefix labels, remove them
        if (str1.startsWith("String1:")) {
            str1 = str1.substring(8);
        }
        if (str2.startsWith("String2:")) {
            str2 = str2.substring(8);
        }

        String commonPrefix = "";
        
        // Loop up to the length of the shorter string
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix += str1.charAt(i);
            } else {
                // Stop checking as soon as a mismatch is found
                break;
            }
        }

        // Check if a common prefix was found
        if (commonPrefix.length() == 0) {
            System.out.println("There is no common prefix between the input strings.");
        } else {
            System.out.println(commonPrefix);
        }
    }
}*/
//ASCII TYPE CASTING 
import java.util.Scanner;

public class lab6task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // Handle cases where sample input includes "String1:" or "String2:" labels
        if (str1.startsWith("String1:")) {
            str1 = str1.substring(8);
        }
        if (str2.startsWith("String2:")) {
            str2 = str2.substring(8);
        }

        String commonPrefix = "";

        // Find the length of the shorter string manually
        int minLength = str1.length();
        if (str2.length() < minLength) {
            minLength = str2.length();
        }

        // Compare character ASCII values index by index
        for (int i = 0; i < minLength; i++) {
            int ascii1 = (int) str1.charAt(i);
            int ascii2 = (int) str2.charAt(i);

            // Compare numerical ASCII codes
            if (ascii1 == ascii2) {
                commonPrefix += (char) ascii1; // Cast back to char and append
            } else {
                break; // Stop immediately at the first ASCII mismatch
            }
        }

        // Output result
        if (commonPrefix.length() == 0) {
            System.out.println("There is no common prefix between the input strings.");
        } else {
            System.out.println(commonPrefix);
        }
    }
}