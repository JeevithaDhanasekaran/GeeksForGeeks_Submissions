//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // taking testcases
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String[] starr = str.split(" ");

            // input n and d
            int n = Integer.parseInt(starr[0]);
            int d = Integer.parseInt(starr[1]);

            int[] arr = new int[n];
            String str1 = br.readLine();
            String[] starr1 = str1.split(" ");

            // inserting elements in the array
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(starr1[j]);
            }

            // calling rotateArr() function
            new Solution().rotateArr(arr, d, n);
            StringBuffer sb = new StringBuffer();

            // printing the elements of the array
            for (int t1 = 0; t1 < n; t1++) sb.append(arr[t1] + " ");
            System.out.println(sb);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d=d%n;
        // Normalize d if it's greater than n
        // if(d==0)
        // return;
        rotate(0,d-1,arr);
        rotate(d,n-1,arr);
        rotate(0,n-1,arr);
    }
    static void rotate(int s,int e,int arr[]){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}