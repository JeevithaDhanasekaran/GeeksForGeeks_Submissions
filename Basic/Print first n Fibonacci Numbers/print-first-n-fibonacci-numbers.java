//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends




//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] fibo=new long[n];
        long c,a=0,b=1;
        int i=0;
        fibo[i]=b;
        while(n>1 && i<n-1){
            c=a+b;
            i++;
            fibo[i]=c;
            a=b;b=c;
        }
        return fibo;
    }
}