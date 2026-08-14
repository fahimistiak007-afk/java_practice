import java.util.Scanner;

public class lab6task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String newName = "";

        for (int i = 0; i <= name.length() - 1; i++) {
            char cr = name.charAt(i);

            // FIX 1: Used single quotes ' ' for char literals
            if (cr == 'A' || cr == 'E' || cr == 'I' || cr == 'O' || cr == 'U') {
                cr = (char) (cr + 32);
            } 
            // FIX 2: Fixed cr == 'i' (double equals sign + single quotes)
            else if (cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u') {
                cr = (char) (cr - 32);
            }

            newName += cr;
        }

        // FIX 3: Output the transformed string
        System.out.println("Redeemable Code: " + newName);
    }
}