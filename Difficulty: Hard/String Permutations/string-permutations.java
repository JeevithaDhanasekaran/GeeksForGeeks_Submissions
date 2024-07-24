//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    ArrayList<String> pStrings=new ArrayList<>();
    public ArrayList<String> permutation(String S)
    {
        permutations("",S);
        Collections.sort(pStrings);
        return pStrings;
    }
    void permutations(String p,String up){
        if(up.isEmpty()){
            pStrings.add(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String sec=p.substring(i,p.length());
            permutations(first+ch+sec,up.substring(1));
        }
            
    }
	   
}
