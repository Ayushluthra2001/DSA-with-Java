//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            // Reading the first array
            String line1 = read.readLine().trim();
            String[] numsStr1 = line1.split(" ");
            int[] a = new int[numsStr1.length];
            for (int i = 0; i < numsStr1.length; i++) {
                a[i] = Integer.parseInt(numsStr1[i]);
            }

            // Reading the second array
            String line2 = read.readLine().trim();
            String[] numsStr2 = line2.split(" ");
            int[] b = new int[numsStr2.length];
            for (int i = 0; i < numsStr2.length; i++) {
                b[i] = Integer.parseInt(numsStr2[i]);
            }

            // Creating an instance of the Solution class
            Solution ob = new Solution();

            // Calling doUnion method and printing the result
            System.out.println(ob.findUnion(a, b));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer>mapping = new HashMap<>();
        
        for(int i =0 ;i<a.length; i++){
            
            if(mapping.containsKey(a[i])){
                int get =mapping.get(a[i]);
                mapping.put(a[i],get+1);
            }else mapping.put(a[i],1);
        }
        for(int i =0 ;i<b.length; i++){
            
            if(mapping.containsKey(b[i])){
                int get =mapping.get(b[i]);
                mapping.put(b[i],get+1);
            }else mapping.put(b[i],1);
        }
        
        
        return mapping.size();
    }
}