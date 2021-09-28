// reverse the digits of a number.
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main (String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int result = 0;
        while(N>0)
        {
            int r = N%10;
            result = result*10 + r;
			N=N/10;
        }
        System.out.println(result);
	}
}