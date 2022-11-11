package Lecture7;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++);
		a++; //Post
		++a; //pre
		System.out.println(a);
		
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
  a = 4;
  a *= 2;
  System.out.println(a);
  
   a ^=2;
   System.out.println(a);
	}
}
// a = a+ 20
// a + = 20