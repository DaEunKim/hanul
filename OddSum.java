package hanul;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total =0;
		int min =999;
		for(int i =0;i<7;i++){
			int N = in.nextInt();
			if(N%2==1 && N<100){
				total += N;
				if(min>N){
					min = N;
				}
			}
		}

		if(total==0)
			System.out.println("-1");
		else{
		System.out.println(total);
		System.out.println(min);
		}

	}

}
