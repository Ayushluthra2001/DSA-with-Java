//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
       int count =0;
        HashMap<Integer,Integer>mapping  = new HashMap<>();
        for(int i =0; i<arr.length;i++){
            int rem = target - arr[i];
            if(mapping.containsKey(rem)) {
                int get = mapping.get(rem);
                count+= get;
            }
            if(mapping.containsKey(arr[i])){
            int get = mapping.get(arr[i]);
            mapping.put(arr[i],get+1);
                
            }else mapping.put(arr[i],1);
        }
        return count;
    }
}

//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.countPairs(nums, target));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
