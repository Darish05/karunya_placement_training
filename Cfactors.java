import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n,count=0;
        n=sc.nextInt();
        for (int i=1;i<=n/2;i++){     
            
            if(n%i==0){
                count++;
            }
            }
        count++;
        System.out.print(count);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
