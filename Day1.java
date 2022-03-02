// Sting problem 


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        /* Enter your code here. Print output to STDOUT. */
        int a =A.compareTo(B);
        
        if(a==1){
            System.out.println("Yes");
        }
       
        else{
            System.out.println("No");
        }
        
        // int a =A.compareTo(B);
    
        // System.out.println(a>0?"Yes":"No");
        String s = A.substring(0,1);
       String d= s.toUpperCase()+A.substring(1);
        String y = B.substring(0,1);
       String e = y.toUpperCase()+B.substring(1);
        
        System.out.println(d+" "+e);
    }
}
