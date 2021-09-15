//Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C in each line.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int min= 0;
        if (a>= c && b>= c){
            min= c;
        }
        else if (b>=a && c>=a){
            min= a;
        }
        else if (c>=b && a>=b){
            min= b;    
        }
        System.out.println(min);
        
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
    }
}