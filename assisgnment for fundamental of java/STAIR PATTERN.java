//Given an integer N, print the corresponding stair pattern for N.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1; i<=n; i++){
            for ( i=1; i<=n; i++){
                String str =("*");
                String re= new String(new char[i]).replace("\0", str);
            
            System.out.println(re);
            }    
        }

    }
}
