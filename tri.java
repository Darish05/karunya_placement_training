import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=2*r-1;
        for(int row=1;row<r;row++){
            for(int col=1;col<c;col++){
                if(row+col==r+1){
                System.out.print("*");
                }
                else if(col-row==r-1){
                    System.out.print("*");
                }
                else if(){
                    
                }
                else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
