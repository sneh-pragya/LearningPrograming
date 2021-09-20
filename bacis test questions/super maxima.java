import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] A= new int[n];
    
        int count= 0;
        for (int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
            for (int i=1;i<n-1;i++){
                if (A[i-1]<A[i] && A[i]> A[i+1]&& A[i-1] + A[i+1] < A[i]){
                    count+=1;
            }
        }
        
        System.out.println(count);
        return;   
    }
}