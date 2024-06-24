import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t > 0) {
            int x = scan.nextInt(); // Prize multiplier
            scan.nextLine(); // Consume the leftover newline
            String s = scan.nextLine(); // Read the game result string

            int firstPlayerPoints = 0;
            int secondPlayerPoints = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'P') {
                    firstPlayerPoints += 2;
                } else if (s.charAt(i) == 'C') {
                    secondPlayerPoints += 2;
                }
            }

            int player1Prize = 0;
            int player2Prize = 0;

            if (firstPlayerPoints > secondPlayerPoints) {
                player1Prize = 75 * x;
                player2Prize = 25 * x;
            } else if (secondPlayerPoints > firstPlayerPoints) {
                player1Prize = 25 * x;
                player2Prize = 75 * x;
            } else {
                player1Prize = 50 * x; // If there's a tie, both get half of the prize
                player2Prize = 50 * x;
            }

            System.out.println(player1Prize);
            t--;
        }

        scan.close();
    }
}
