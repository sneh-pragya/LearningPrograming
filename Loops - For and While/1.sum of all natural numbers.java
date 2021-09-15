//Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum= 0;
        int i=0;
        while(i<=N){
            sum= sum+i;
            i++;
        }
        System.out.println(sum);
        
    }
}