package Assignment2;
import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digit;
		int ev=0,odd=0;
		while(N>0)
		{
			digit=N%10;
			N=N/10;
			if(digit%2!=0)
				odd=odd+digit;
			else
				ev=ev+digit;
		}
		System.out.print(ev+" "+odd);
	}
}
	