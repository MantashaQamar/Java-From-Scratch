import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			
			boolean isALargest = (a >= b) && (a >= c);
			System.out.println(isALargest);

			
			

		}

	}
