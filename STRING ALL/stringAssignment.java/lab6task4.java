import java.util.Scanner;

public class lab6task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the full input string and the separator character
        String inputString = sc.nextLine();
        String delimiterStr = sc.nextLine();
        char delimiter = delimiterStr.charAt(0);

        System.out.println("The words are:");

        String currentWord = "";

        // Loop through the input string up to inputString.length()
        for (int i = 0; i <= inputString.length(); i++) {
            
            // Check if we hit the delimiter OR the end of the string
            if (i == inputString.length() || inputString.charAt(i) == delimiter) {
                
                if (currentWord.length() > 0) {
                    // Clean the current word by removing duplicate letters
                    String cleanedWord = "";
                    
                    for (int j = 0; j < currentWord.length(); j++) {
                        char c = currentWord.charAt(j);
                        
                        // Check if character 'c' has already been added to cleanedWord
                        boolean alreadyExists = false;
                        for (int k = 0; k < cleanedWord.length(); k++) {
                            if (cleanedWord.charAt(k) == c) {
                                alreadyExists = true;
                                break;
                            }
                        }
                        
                        // If it's the first occurrence, append it
                        if (!alreadyExists) {
                            cleanedWord += c;
                        }
                    }
                    
                    // Print the cleaned word
                    System.out.println(cleanedWord);
                    
                    // Reset currentWord for the next word
                    currentWord = "";
                }
            } else {
                // Keep building the current word character by character
                currentWord += inputString.charAt(i);
            }
        }
    }
}