package Lecture4A;
import java.util.Scanner;
import java.lang.Math; 
public class TotalSalary {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		String str=s.next();
		char grade=str.charAt(0);
		int allow;
		if(grade==65)
		{
			allow=1700;
		}
		else if(grade==66)
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		double totalSalary=((basic+(0.20*basic)+(0.50*basic)+allow)-(0.11*basic));
		double p=Math.round(totalSalary);
		int h=(int)(p);
		System.out.println(h);
	}
}

