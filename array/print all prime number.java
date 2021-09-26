// print all the prime numbers upto given N.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean p=true;
        for (int i=2; i<=n; i++){
            p=true;
            for (int j=2; j*j<=i; j++){
                if(i%j==0){
                    p = false;
                    break;
                }
                //System.out.println(i);
            }
            if(p==true)
            System.out.println(i);
        }
        
        
    }
}