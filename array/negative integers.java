//Write a program to print all negative numbers from input array A of size N,
//where you have to take integer N and further N elements as input from user.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n;i++){
            a[i]= sc.nextInt();
            if (a[i]<0){
                System.out.print(a[i]+" ");
            }
        }
       
        
    }
}