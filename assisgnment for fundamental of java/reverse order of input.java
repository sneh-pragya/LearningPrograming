//https://www.scaler.com/academy/mentee-dashboard/classroom/arrays-arraylists-2a624afd-ddb8-4108-9a85-266e9fa2f338/#assignment

//Write a program to print the input array A of size N in reverse order
//where you have to take integer N and further N elements as input from user.


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] N= new int[n];
        for(int i = 0 ; i < n ; i++){
            N[i] = sc.nextInt();
        }
        
         for(int i = n-1; i >= 0; i--){
            System.out.print(N[i]+ " ");
         }
        
    }
}