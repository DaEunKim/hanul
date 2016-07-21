package hanul;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a =100;
		int b =100;
		for(int i=0;i<n;i++){
			int A = in.nextInt();
			int B = in.nextInt();
			if(A<B)
				a = a-B;
			if(A>B)
				b = b-A;
			if(A==B){
				a=a;
				b=b;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}
