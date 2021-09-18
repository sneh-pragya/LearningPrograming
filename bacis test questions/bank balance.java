//You are given a Bank account having N amount and you are asked to perfrom ADD(credit)
//and SUBTRACT(debit) operations.
//After each operation print the amount left in the Bank account. 
//If the debit amount is greater than current balance print "Insufficient Funds"(without quotes)
//and the operation is skipped.
//First line contains a single integer N denoting the balance in bank account.
//Second line contains a single integer M denoting the number of operations.
//Each of next M lines contains two space separated integers Type and Amount(X).
//If Type == 1, Perform ADD operation.
//If Type == 2, Perform SUBTRACT operation.
//
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();
        int m= sc.nextInt();
        int[] t= new int[m];
        long[] A= new long [m];
        long bal=N;
        for (int i=0; i<m; i++){
             t[i] = sc.nextInt();
             A[i] = sc.nextLong();
            
            if (t[i]==1){
                bal= bal+A[i];
                System.out.println(bal);
            }
            else if(t[i]==2 && bal < A[i]){
                System.out.println("Insufficient Funds");
            
            }
            else if (t[i]==2 && bal > A[i]){
                bal= bal-A[i];
                System.out.println(bal);
            }
            
        }
        
    }
}