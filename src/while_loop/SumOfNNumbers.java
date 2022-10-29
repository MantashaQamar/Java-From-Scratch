package while_loop;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
		  int i= 1;//Next number to be added
		  int sum =0;
		  
		  while(i <= n){
              sum= sum+i;
              i=i+1;
	}
System.out.println(sum);
}
}