import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            if (n == 0 || k == 0 || k > n || k<0) {
                System.out.println(0);
            } else {
//                 int value = arr[k - 1];
//                 int count = 0;
                
//                 for (int i = 0; i < n; i++) {
//                     if (arr[i] >= value) {
//                         count++;
//                     }
//                 }
                
//                 System.out.println(count);
                int value=arr[k-1];
            int i=0;
            int j=n-1;
            int index=0;
            while(i<=j){
                int mid=i+(j-i)/2;
                if(arr[mid]>=value){
                    index=mid;
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
            System.out.println(index+1);
            }
            
            t--;
        }
        
        scan.close();
    }
}
