package Assignment2;
import java.util.Scanner;
public class PowerOfANumber {

	public static void main(String[] args) {
		
		        
		          Scanner s=new Scanner(System.in);
		          int n=s.nextInt();
		          int x=s.nextInt();
		          int p=1;
		          for(int i=1;i<=x;i++)
		          {
		               p=p*n;
		          }
		          System.out.println(p);
		          
	}
}

