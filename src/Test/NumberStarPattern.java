package Test;
import java.util.Scanner; 
public class NumberStarPattern {

		public static void main(String []args){  
			 Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
		        int i,j; 
		   for(i=1;i<=n;i++){// this loop is used to print the lines  
		      for(j=n;j>=1;j--){// this loop is used to print numbers in a line  
		          if(j!=i)  
		           System.out.print(j);  
		           else  
		            System.out.print("*");  
		   }  
		   System.out.println("");  
		   }  
		    }}   
