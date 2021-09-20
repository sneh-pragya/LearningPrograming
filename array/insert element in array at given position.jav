// Write a program to input N numbers array from user and insert an element Y in it at specified position X.
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n+1];
        for (int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int x= sc.nextInt();
        int y= sc.nextInt();
        int dataA = a[x-1];
        a[x-1]= y;
        int dataB;
        for (int i=x; i<n+1; i++){
            dataB = a[i];
            a[i]= dataA;
            dataA = dataB;
        }
        for(int i = 0; i < n+1; i++)
            System.out.print(a[i]+" ");
    }
}