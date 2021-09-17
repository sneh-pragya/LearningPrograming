//Write a program to print all even numbers from 1 to N where you have to take N as input from user.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        for (int i=2; i<=N; i=i+2){
                System.out.print(i + " ");
        }
        
    }
}