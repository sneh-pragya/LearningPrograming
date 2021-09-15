//Write a program to input from user a float value(A) representing the height of persons.

//You have to print the category of that person.
//If the height is greater than or equal to 195 then that person is "abnormal".
//If the height is in range of [165 -195) then that person is "taller".
//If the height is in range of [150 -165) then that person is "average".
//If the height is smaller than 150 then that person is "dwarf".

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        if (a>= 195){
            System.out.println("abnormal");
        }
        else if (a>=165 && a <195){
            System.out.println("taller");
        }
        else if (a>= 150 && a< 165){
            System.out.println("average");
        }
        else if (a<150){
            System.out.println("dwarf");
        }
        
        
    }
}