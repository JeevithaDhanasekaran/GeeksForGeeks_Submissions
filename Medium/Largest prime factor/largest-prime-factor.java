//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static long largestPrimeFactor(int n) {
        long max=0;
        Set<Integer> primefactor=new LinkedHashSet<Integer>();
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                primefactor.add(i);
                n/=i;
            }
        }
        if(n>1){
            primefactor.add(n);
        }
        for(Integer value:primefactor){
            if(value>max)
                max=value;
        }
        return max;
    }
}