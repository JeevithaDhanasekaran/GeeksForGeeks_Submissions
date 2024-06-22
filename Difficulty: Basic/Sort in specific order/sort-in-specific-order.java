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
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList<Long> odd=new ArrayList<Long>();
        ArrayList<Long> even=new ArrayList<Long>();
        
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
            even.add(arr[i]);
            else
            odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        
        int ind=0;
        for(long num:odd)
        arr[ind++]=num;
        
        for(long num:even)
        arr[ind++]=num;
    }
}