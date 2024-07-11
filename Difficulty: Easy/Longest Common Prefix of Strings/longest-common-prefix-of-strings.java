//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(n, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String longestCommonPrefix(int n, String arr[]) {
        // code here
        int minInd=Integer.MAX_VALUE;
        String minString="";
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            if(temp.length()<minInd){
                minInd=temp.length();
                minString=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            int ind=temp.indexOf(minString,0);
            // System.out.println(ind);
            if(ind==-1 && minInd>0){
                minString=minString.substring(0,minInd);
                i=-1;
                minInd--;
            }
        }
        if(minInd==0)
            return "-1";
        return minString;
    }
}