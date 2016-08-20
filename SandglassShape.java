package hanul;

import java.util.Scanner;

public class SandglassShape {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String s = "*";
		
		for(int i=N;i>=1;i--){
			int k = 2*i-1;
			int t = N-i;
			for(int j=0;j<t;j++){
				System.out.print(" ");
			}
			for(int j=0;j<k;j++){
				System.out.print(s);
			}
			System.out.println();
		}
		
		for(int i=2;i<=N;i++){
			int k = 2*i-1;
			int t = N-i;
			for(int j=0;j<t;j++){
				System.out.print(" ");
			}
			for(int j=0;j<k;j++){
				System.out.print(s);
			}
			System.out.println();
		}

	}

}
