package hanul;

import java.util.Scanner;

public class Pibonaci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int tmp=0;
		for(int i=0;i<n;i++){
			tmp= a+b;
			b=a;
			a=tmp;
			
			
		}
		System.out.println(tmp);

	}

}
