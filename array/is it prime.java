// Is It Prime?

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        long A= sc.nextInt();
        boolean prime= true;
    
        for (int i=2; i<A-1; i++){
            if(A%i==0){
                prime= false ;
                break;
            }
            else{
                prime= true;
            }
        }
        if(prime== false){
            System.out.print("NO");
            }
        else if(prime== true) {
         System.out.print("YES");
             }
    }
}