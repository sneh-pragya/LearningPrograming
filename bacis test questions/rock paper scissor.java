//Rock Paper Scissor Variant

import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String arr=new String();
        arr = sc.nextLine();
        
        String[] a=new String[3];
        a[0] = sc.nextLine();
        a[1] = sc.nextLine();
        a[2] = sc.nextLine();
       
        if(a[0].charAt(0) == a[1].charAt(0) || a[0].charAt(0) == a[2].charAt(0) || a[2].charAt(0) == a[1].charAt(0) ||
        a[0].charAt(2) == a[1].charAt(2) || a[0].charAt(2) == a[2].charAt(2) || a[2].charAt(2) == a[1].charAt(2))
            System.out.print(0);
        else
            System.out.print(1);
    }
}