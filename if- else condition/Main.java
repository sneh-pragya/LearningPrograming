//Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=0;
        
        if (a>=b && b>= c){
             max= a;
        }
        else if (b>=a && a>=c){
             max=b;
        }
        else {
            max=c;
        }    
        System.out.println( max);
        
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}