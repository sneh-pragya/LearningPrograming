//For a given number A, print its multiplication table having the first 10 multiples.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int i=1;
        int mult=1;
        while (i<=10){
            mult= a*i;
            System.out.println(a + " * " + i + " = " +  mult);
            i++;
        }
    }
}