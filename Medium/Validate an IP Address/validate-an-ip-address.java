//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        String[] part=s.split("\\.");
        if(part.length !=4)
            return false;
        if (s.charAt(s.length() - 1) == '.')
            return false;
        for(String strch:part){
            if(strch.isEmpty() || strch.length()>3)
                return false;
            for(int j=0;j<strch.length();j++)
                if(!Character.isDigit(strch.charAt(j)))
                    return false;
            int num=Integer.parseInt(strch);
            if(num<0 || num>255)   return false;
            if(strch.length()>1 && strch.charAt(0)=='0'&& strch.charAt(1) != '.')
                return false;
        }
        
        return true;
    }
}