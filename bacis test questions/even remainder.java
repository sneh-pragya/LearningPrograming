//Write a program to input an integer A and another array B of N numbers from user and print the count of elements of B such that B[i]%A is even.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        int count=0;
        //int[] b = new int[n];
        for (int i=0; i<n;i++){
            //a[i]= sc.nextInt();
          int b = sc.nextInt();
            if ((b%a)%2==0){
                count+= 1;
            }
        }
        System.out.print(count);

    }
}