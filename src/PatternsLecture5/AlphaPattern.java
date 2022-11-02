package PatternsLecture5;
import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int i=1;
		  while( i<=n) {
			  int j = 1; 
			  char startingChar = (char)('A' + i- 1 );
		  while( j<= i) {
			  System.out.print(startingChar );
			  
			 j =j + 1;
			  
		  }
		  System.out.println();
		  i++;

	}

}
}
