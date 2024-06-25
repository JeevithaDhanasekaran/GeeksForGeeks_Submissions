//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        //code here
        StringBuilder str=new StringBuilder();
        StringBuilder vow=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                vow.append(s.charAt(i));
        }
        vow.reverse();
        j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                str.append(vow.charAt(j++));
            else
            str.append(s.charAt(i));
        }
        return str.toString();
        
    }
    boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}