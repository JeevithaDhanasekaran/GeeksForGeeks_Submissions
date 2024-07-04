//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int n, int ratings[]) {
        // code here
        int[] candies1=new int[n];
        int[] candies2=new int[n];
        Arrays.fill(candies1,1);
        Arrays.fill(candies2,1);
        
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies1[i]=candies1[i-1]+1;
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies2[i]=candies2[i+1]+1;
            }
        }
        int tot=0;
        for(int i=0;i<n;i++){
            candies1[i]=Math.max(candies1[i],candies2[i]);
            tot+=candies1[i];
        }
        return tot;
    }
}
