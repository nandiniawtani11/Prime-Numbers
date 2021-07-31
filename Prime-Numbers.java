import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        boolean flag;
        while(T-->0)
        {
            flag=true;
            int n=sc.nextInt();
            if(n==1)
            {
                System.out.println("Not prime");
                continue;
            }
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    System.out.println("Not prime");
                    flag=false;
                    break;                       
                }
            }
            if(flag)
            { 
                System.out.println("Prime");
                
            }   
        }
    }
}



