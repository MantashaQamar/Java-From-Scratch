package PatternsLecture5;
import java.util.Scanner;
public class SqPattern {
	public static void main(String[] args) {
	
 Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
		
	int i=1;
	while (i<=N) {
		int j =1;
		while(j<=N){
			System.out.print( N );
			j++;
		}
		System.out.println();
		i++;
	}

}
}
