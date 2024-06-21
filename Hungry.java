import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int n ;
        int t;
        t=scan.nextInt();
        while(t>0){
           
            n=scan.nextInt();
            int arr[] =new int[n];
            for(int i=0; i<n; i++){
                arr[i]=scan.nextInt();
                
            }
            
            int mini=Integer.MAX_VALUE;
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(mini>arr[i]) mini=arr[i];
                if(maxi<arr[i]) maxi=arr[i];
            }
            System.out.println(mini+" "+maxi);
            t--;
        }
        
        
    }
}
