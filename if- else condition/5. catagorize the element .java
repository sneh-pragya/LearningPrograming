//Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (A>0) {
            
                System.out.println(1); 
                }
        else if (A<0){
        System.out.println(-1); 
        }
        else if (A==0){
        System.out.println(0); 
        }
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}