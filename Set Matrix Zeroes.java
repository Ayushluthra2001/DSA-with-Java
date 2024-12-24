//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        
    for(int i = 0;i<mat.length; i++){
            for(int j =0; j<mat[0].length;j++){
                if(mat[i][j] == 0) mat[i][j] = -1325222;
                
            }
        }
        // cout<<endl;
        // for(int i = 0;i<mat.size(); i++){
        //     for(int j =0; j<mat[0].size();j++){
        //       cout<<mat[i][j]<<" ";
                
        //     }
        //     cout<<endl;
        // }
        // cout<<endl;
        
        for(int i =0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == -1325222){
                   // cout<<"Hello"<<endl;
                    for(int k = j+1;k<mat[0].length && mat[i][k]!=-1325222; k++){
                        mat[i][k]  = 0;
                    }
                    for(int k = i+1; k<mat.length && mat[k][j] != -1325222; k++){
                        mat[k][j] = 0;
                    }
                    for(int k = j-1; k>=0 && mat[i][k] != -1325222; k--){
                        mat[i][k]  = 0;
                    }
                    for(int k = i-1; k>=0 && mat[k][j] != -1325222; k--){
                        mat[k][j] = 0;
                    }
                }
            }
            
            
        }
        for(int i =0; i<mat.length;i ++){
                for(int j = 0; j<mat[0].length;j++){
                    if(mat[i][j] == -1325222) mat[i][j] = 0;
                }
            }
            
            return ;
    }
}
