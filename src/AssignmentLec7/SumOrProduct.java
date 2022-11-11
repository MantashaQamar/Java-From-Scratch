package AssignmentLec7;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int c= sc.nextInt();
		int i,sum=0,mul=1;
		      	if(c==1)
		        {
		            while(n<13 && n>0)
		            {
		                sum=sum+n;
		                
		                n--;
		            }
		            System.out.println(sum);
		        }
		      	else if(c==2)
		      	{
		      		while(n>0)
		      		{
		      			mul=mul*n;
		      			n--;
		      		}
		      		 System.out.println(mul);
		      	}
		      	else
		      	{
		      		System.out.println(-1);
		      	}
		}

	}

