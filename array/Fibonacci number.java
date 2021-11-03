//Fibonacci Number
//Given a positive integer A,
// write a program to find the Ath Fibonacci number.
//In a Fibonacci series, each term is the sum of the previous
// two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. 
//Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] FS= new int [n+1];
        FS[0] = 0;
        FS[1] = 1;
        for (int i=2; i<n+1; i++){
            FS[i]= FS[i-1]+ FS[i-2];
        }
        System.out.println(FS[n]);
    }
}