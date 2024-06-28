//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends





class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
        // Your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // System.out.println(map);
        int maxcount=0;
        char maxchar='a';
        for(Character key:map.keySet()){
            int val=map.get(key);
            if((val>maxcount)||(val==maxcount && key<maxchar)){
                maxcount=val;
                maxchar=key;
            }
        }
        return maxchar;
    }
    
}