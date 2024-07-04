//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        int a = 1, b = 1;
        int c = 2;
        for(int i=4; i<=n; i++){
            a = b;
            b = c;
            c = (a+b)%1000000007;
        }
        return c;
    }
}