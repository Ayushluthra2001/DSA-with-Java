import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine(); 

        while (t > 0) {
            String s = scan.nextLine();
            StringBuilder temp = new StringBuilder();
           
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    temp.append('A');
                } else if (s.charAt(i) == '1') {
                    temp.append('B');
                }
            }
            System.out.println(temp);
            t--;
        }
        
        scan.close();
    }
}
