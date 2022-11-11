package AssignmentLec7;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 long bn, dn = 0, j = 1, rem;
		  bn = sc.nextLong();
		  while (bn!= 0) 
		  {
		   rem = bn% 10;
		   dn = dn + rem * j;
		   j = j * 2;
		   bn = bn/ 10;
		  }
		  System.out.println(dn);
		 }
		
	}

