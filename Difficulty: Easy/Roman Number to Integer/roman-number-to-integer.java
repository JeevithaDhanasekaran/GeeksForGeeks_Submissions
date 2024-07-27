//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int sum=0;
        for(int i=str.length()-1;i>=0;i--){
            if(i==str.length()-1)
            sum+=map.get(str.charAt(i));
            else if(map.get(str.charAt(i)) >= map.get(str.charAt(i+1)) )
            sum+=map.get(str.charAt(i));
            else
            sum=Math.abs(sum-map.get(str.charAt(i)));
        }
        return sum;
    }
}