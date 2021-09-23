//Write a program to input T numbers(N) from user and print count of digits of the given numbers.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        sc.nextLine();
        String str= new String();
        int count = 0;
        for (int i=0;i<n;i++){
            str = sc.nextLine();
            count= str.length();
            System.out.println(count);
        }
        
    }
}