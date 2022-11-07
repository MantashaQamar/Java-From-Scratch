package Lecture6A;
import java.util.Scanner;
public class HlfDimondPattern {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        
	        int n=sc.nextInt(); 
	        int i, j;
	        

	        System.out.println("*");
	        // Print the first upper half
	        for(i=1; i<=n; i++)
	        {
	        	 System.out.print("*");
	            for(j=1; j<=i; j++) {
	            	System.out.print(j);}
	            for(j=i-1; j>=1; j--) {
	            	System.out.print(j);}
	            
	            	System.out.print("*");

	            System.out.println();
	        }

	        for(i=n-1; i>=1; i--)
	        {
	        	System.out.print("*");
	            for(j=1; j<=i; j++)
	            {
	            	System.out.print(j);
	            }

	            for(j=i-1; j>=1; j--)
	            {
	            	System.out.print(j);
	            }
	            System.out.print("*");

	            System.out.println();
	        }
	        System.out.print("*");
	        }
	}



	    