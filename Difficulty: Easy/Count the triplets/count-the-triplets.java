//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        Set<Integer> set=new HashSet<Integer>();
        for(int ele :arr)
        set.add(ele);
        
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                // System.out.print(sum+" ");
                if(set.contains(sum)){
                    count++;
                    // break;
                }
            }
        }
        return count;
    }
}