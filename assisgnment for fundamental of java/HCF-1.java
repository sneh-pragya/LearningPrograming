// Write a program to input an integer T and 
// then T lines each containing two integers A & B from user and print T lines
// conatining HCF of two given 2 numbers A and B.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [][] a = new int[n][2];
        for (int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                a[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<n; i++){
            int hcf=1;

                int x = 2;
                while ( x<= a[i][1] && x <= a[i][0]){
                    if (a[i][1]%x==0 && a[i][0]%x==0){
                            a[i][0]= a[i][0]/x;
                            a[i][1]= a[i][1]/x;
                            hcf = hcf*x;
                    } 
                    else {
                        x++;
                    }
                }

            System.out.println(hcf);
        }
    } 
}
