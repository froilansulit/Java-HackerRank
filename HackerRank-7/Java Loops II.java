import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            s = a;
            int sk = 0;
            do {
                s += b * Math.pow(2, sk);
                System.out.print(s + " ");
                sk++;
            }
            
            while(sk < n);
            System.out.println();
        }
        in.close();
    }
}
