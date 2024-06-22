//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long N)  
    {
        long[] min12=new long[2];
        long m1,m2;
        m1=m2=Long.MAX_VALUE;
        for(long n:a){
            if(n<m1)
            m1=n;
        }
        for(long n:a){
            if(n>m1 && n<m2)
            m2=n;
        }
        if(m1>=1 && m2 < Long.MAX_VALUE){
        min12[0]=m1;
        min12[1]=m2;
        }
        else{
            min12[0]=-1;
            min12[1]=-1;
        }
        
        return min12;
    }
}
