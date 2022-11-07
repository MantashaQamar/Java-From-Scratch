package Lecture6A;
import java.util.Scanner;
public class Rough2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	    int i,j;
	 

	    /* Iterate through each row */
	    for(i=1; i<=n; i++)
	    {
	        /* Print trailing spaces */
	        for(j=1; j<=n - i; j++)
	        {
	        	System.out.print(" ");
	        }

	        /* Print stars after spaces */
	        for(j=1; j<=n; j++)
	        {
	        	System.out.print("*");
	        }

	        /* Move to the next line */
	        System.out.println();
	    }

	}
	}