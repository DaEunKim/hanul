package hanul;

import java.util.Scanner;

public class ThreeNum {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if((A>B && A>C && B>C)||(C>B && B>A && C>A)){
			System.out.println(B);//B가 mid인 경우
		}
		if((B>A && A>C && B>C) || (C>A && A>B && C>B) ){
			System.out.println(A);
		}
		if((B>C && C>A && B>A)||(A>C && C>B && A>B)){
			System.out.println(C);
		}
		
		if(A==B && (A>C || A<C))
			System.out.println(A);
		if(A==C && (A>B || A<B))
			System.out.println(A);
		if(B==C && (B>A || B<A))
			System.out.println(B);
		if(A==B && B==C)
			System.out.println(A);
		

	}

}
