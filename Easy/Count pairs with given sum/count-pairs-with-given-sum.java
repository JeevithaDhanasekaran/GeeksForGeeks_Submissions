//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int pcount=0;
        Map<Integer,Integer> sumcount=new HashMap<>();
        for(int i=0;i<n;i++){
            int comp=k-arr[i];
            if(sumcount.containsKey(comp))
                pcount+=sumcount.get(comp);
            sumcount.put(arr[i],sumcount.getOrDefault(arr[i],0)+1);
        }
        return pcount;
        // code here
        // int pcount=0,left;
        // for(int i=0;i<n-1;i++){
        //     left=i+1;
        //     while(left<n){
        //         if(arr[i]+arr[left]==k){
        //             pcount++;
        //         }
        //         left++;
        //     }
        // }
        // return pcount;
    }
}
