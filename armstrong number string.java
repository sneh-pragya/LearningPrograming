// //You are given an integer N you need to print all the
// //Armstrong Numbers between 1 to N.

// If sum of cubes of each digit of the number is equal to the number itself, 
// //then the number is called an Armstrong number.

// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N= sc.nextInt();
       // int a1,a2,a3;
       // int j;
       
        // for (int i=1; i<=N;i++){
        //     j = i;
        //     a1 =j%10;
        //     j=j/10;
        //     a2=j%10;
        //     j=j/10;
        //     a3=j%10;
            
        //     if(i == (a1*a1*a1+a2*a2*a2+a3*a3*a3)) {
        //         System.out.println(i) ;
        //     }
        // }
        String s;
        int[] a= new int[3];
        for(int i =1; i <= N; i++) {
            s = Integer.toString(i);
            for(int k = 0; k < 3;k++) {
                if(k < s.length())
                    a[k] = Character.getNumericValue(s.charAt(k)); 
                else
                    a[k] = 0;
            }
            int sum = (int)(Math.pow(a[0],3) + Math.pow(a[1],3) +Math.pow(a[2],3));
            if(i == sum) {
                System.out.println(i) ;
            }
        }
        
    }
}