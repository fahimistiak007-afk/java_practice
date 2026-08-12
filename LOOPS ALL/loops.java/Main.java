import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int totalWins = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {

                if (i % j == 0) {
                    System.out.println(i + " beats " + j);
                    totalWins++;
                }

                if (j % i == 0) {
                    System.out.println(j + " beats " + i);
                    totalWins++;
                }
            }
        }

        System.out.println("Total wins: " + totalWins);
    }
}