//Write a program to input T numbers(N) from user and print all the factors of the given numbers.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] N= new int[n];
        for(int i = 0 ; i < n ; i++){
            N[i] = sc.nextInt();
            int factor =1;
            for (int j = 1 ; j<= N[i] ; j++){
                if( N[i] % j == 0){
                    factor = j;
                  
                 System.out.print(factor+ " ");   
                    
                }
            }
           System.out.print('\n');
        }
    }
}