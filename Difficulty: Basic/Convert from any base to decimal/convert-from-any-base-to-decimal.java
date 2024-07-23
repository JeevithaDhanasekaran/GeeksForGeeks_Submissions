//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int b = Integer.parseInt(in.readLine());
            String N = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decimalEquivalent(N, b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int decimalEquivalent(String N, int b)
    {
        int sum=0;
        int p=0;
        // code here
        for(int i=N.length()-1;i>=0;i--){
            int n=Character.getNumericValue(N.charAt(i));
            if(n>=b)
                return -1;
            sum=sum + (n*((int)Math.pow(b,p)));
            p++;
        }
        return sum;
    }
}
