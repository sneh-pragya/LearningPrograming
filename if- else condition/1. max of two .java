// Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        if (A>B){
            System.out.println (A);
        }
        else{
            System.out.println (B);
        }
    }
}
