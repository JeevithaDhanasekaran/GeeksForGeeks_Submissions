//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends

//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int n)
    {
        Arrays.sort(a);//01245
        Arrays.sort(b);//01245
        for(int i=0;i<n;i++){//0
            if(a[i]!=b[i])//1==2
                return false;
        }
        return true;
    }
}