package PatternsLecture5;
import java.util.Scanner;
public class ReverseNoPattern {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		  {
			  int i, j;
			  for(i=1;i<=n;i++)
			  {
			  for(j=i;j>=1;j--)
			  {
			  System.out.print(j);
			  }
			  System.out.println("");
			  }
		  }
	}
}