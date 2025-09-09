import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c)
            System.out.print("Equilateral");
        else if(a==b || b==c || c==a)
            System.out.print("Isosceles");
        else
            System.out.print("Scalene");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
