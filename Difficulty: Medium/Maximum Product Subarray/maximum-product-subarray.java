//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if(n==1)
        return arr[0];
        
        long maxprod,prod,minprod;
        maxprod=arr[0];
        minprod=arr[0];
        prod=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                long temp=maxprod;
                maxprod=minprod;
                minprod=temp;
            }
            maxprod=Math.max(arr[i],arr[i]*maxprod);
            minprod=Math.min(arr[i],arr[i]*minprod);
            prod=Math.max(prod,maxprod);
        }
        return prod;
    }
}