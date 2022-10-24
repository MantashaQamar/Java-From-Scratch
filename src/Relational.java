import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		int j= sc.nextInt();
		boolean isEq=(i == j);
		boolean neq=(i != j);
		boolean isgr=(i > j);
		boolean isgreq =(i >= j);
		boolean isless=(i < j);
		boolean islessEq=(i <= j);
		System.out.println("Is Equal" + isEq);
		System.out.println("Is Not Equal" + neq);
		System.out.println("Is Greater" + isgreq);
		System.out.println("Is Greater Equal" + isless);
		System.out.println("Is Less" + islessEq);
		System.out.println("Is Less Equal" + isEq);

	}

}
