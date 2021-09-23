//Given an integer N, print the corresponding Full Pyramid pattern for N.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for (int space= 1; space<=n-i; space++){
                System.out.print(" ");    
            }
            for (int star= 1; star<= i; star++){
                System.out.print("* "); 
            }
            System.out.println();
        }
        
    }
}