//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int f,s,t;
	    f=Integer.MIN_VALUE;
	    s=Integer.MIN_VALUE;
	    t=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        if(a[i]>t){
	            if(a[i]>s){
	                if(a[i]>f){
	                    t=s;
	                    s=f;
	                    f=a[i];
	                }
	                else{
	                    t=s;
	                    s=a[i];
	                }
	            }
	            else{
	                t=a[i];
	            }
	        }
	    }
	    return t;
    }
}
