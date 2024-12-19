//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        
         ArrayList<Integer>ans = new ArrayList<Integer>();
        
       
        int start = 0;
        int n = mat.length;
        int m = mat[0].length;
        int startRow = 0 , endRow = n-1, startCol = 0 , endCol = m-1;
        int total = n*m;
    
        while(start <= n*m){
            
            for(int i =startCol; i<=endCol && start< total; i++){
                ans.add(mat[startRow][i]);
                start++;
            }
            startRow++;
            if(start >= total) return ans;
            for(int i = startRow; i<=endRow && start <total; i++){
                ans.add(mat[i][endCol]);
                start++;
            }
            endCol--;
             if(start >= total) return ans;
            for(int i =endCol; i>=startCol && start<total; i--){
                ans.add(mat[endRow][i]);
                start++;
            }
            endRow--;
             if(start >= total) return ans;
            for(int i=endRow;i>=startRow && start<total; i--){
                ans.add(mat[i][startCol]);
                start++;
            }
            startCol++;
             if(start >= total) return ans;
            
        }
        
        return ans;
    }
}
