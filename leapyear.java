import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int y=sc.nextInt();
        if (y%400==0)
            System.out.print("Leap year");
        else if (y%100==0)
            System.out.print("Not a Leap year");
        else if (y%4==0)
            System.out.print("Leap year");
    }
}
