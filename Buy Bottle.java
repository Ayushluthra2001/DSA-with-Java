import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t>0){
                int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
            int n;
            n=scan.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
        for(int i=0; i<n; i++){
            
            
            if(firstLargest<=arr[i]){
                if(firstLargest!=arr[i] && firstLargest!=Integer.MIN_VALUE){
                    secondLargest = firstLargest;
                }
                firstLargest=arr[i];
                
            }else if(firstLargest > arr[i] && secondLargest<arr[i]){
                    secondLargest = arr[i];
            }
          // System.out.println(firstLargest+" "+secondLargest);
        }
        
         secondLargest=secondLargest==Integer.MIN_VALUE  ? -1 : secondLargest;
            System.out.println(secondLargest);
            t--;
        }
       
    }
}
