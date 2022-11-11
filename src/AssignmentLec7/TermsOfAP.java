package AssignmentLec7;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=1,sum,i=1;
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}
			
	}
}