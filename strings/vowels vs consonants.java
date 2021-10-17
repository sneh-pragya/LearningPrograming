//Write a program to input T strings (S) from user and print count of vowels and consonants in it.

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String vowels= "aeiou";
        
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        sc.nextLine(); 
        while(T-- > 0) {
            String str= sc.nextLine(); 
            int n= str.length();
            int vowel_count = 0;
            int consonant_count = 0;
            for ( int i = 0; i < n ; i++){
                for ( int j = 0; j < 5; j++){
                    if ( vowels.charAt(j) == str.charAt(i)){
                        vowel_count+=1;
                        break;
                    }
                    
                }
            }
            System.out.println(vowel_count + " " + (n - vowel_count) );
        }
    }
}