// calculate electricity bill

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
        Scanner sc= new Scanner(System.in); 
		int n= sc.nextInt();
        sc.close();
        int bill= 0;
        if ( n<=100){ 
            bill=0;    
        }
        else if  (n>100 && n<=200){
            bill = (n-100)*5;   
        }        
        else if ( n>200 && n<=300){
            bill = (n-200)*10+ (100)*5;
        }
        else if ( n>300 ){
            bill= (n-300)*12 + (100)*10 + (100)*5;
            
        }
          System.out.println(bill);
        }
}
