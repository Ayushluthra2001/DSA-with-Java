import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int t;
        Scanner scan = new Scanner(System.in);
        t=scan.nextInt();
         scan.nextLine();
        while(t>0){
            String s;
            s=scan.nextLine();
            String s2=scan.nextLine();
             StringBuilder temp = new 
                      StringBuilder("");
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s2.charAt(i)) temp.append('F');
                else temp.append('T');
            }
            System.out.println(temp);
            
            t--;
        }
    }
}
