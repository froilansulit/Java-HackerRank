import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag = true;
static int B;
static int H;

static{

Scanner ww = new Scanner(System.in);
B = ww.nextInt();
ww.nextLine();
H = ww.nextInt();
ww.close();
if(H>0 && B>0){
    flag = true;

}else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}

// Write your code here


public static void main(String[] args){
