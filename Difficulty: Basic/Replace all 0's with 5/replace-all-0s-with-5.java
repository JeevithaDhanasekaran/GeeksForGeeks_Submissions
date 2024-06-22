//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        int n=num;
        int d,i=0;
        while(num !=0){
            d=num%10;
            if(d==0){
                n+=5*Math.pow(10,i);
            }
            i++;
            num/=10;
        }
        return n;
    }
}