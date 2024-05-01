//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            String a = S[0];
            String b = S[1];

            Solution ob = new Solution();
            System.out.println(ob.getLastDigit(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getLastDigit(String a, String b) {
        BigInteger base=new BigInteger(a);
        BigInteger exp=new BigInteger(b);
        BigInteger modulo=BigInteger.valueOf(10);
        BigInteger result=base.modPow(exp,modulo);
        return result.intValue();
        // int aval=Integer.parseInt(a.charAt(a.length()-1)+"");
        // int bval=Integer.parseInt(b);
        // if(aval==1)
        //     return 1;
        // if(bval==1)
        //     return aval%10;
        // int result=1;
        // // System.out.println(aval+" "+bval);
        // aval%=10;
        // while(bval>0){
        //      if(bval%2==1){
        //          result=(result*aval)%10;
        //      }
        //      aval=(aval*aval)%10;
        //      bval/=2;
        //  }
        // return result;
    }
};