package hanul;

import java.util.Scanner;

public class HowMuch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		int price = 0;
		int total = 0;
		for(int i=0; i<testcase; i++){
			int s = in.nextInt();
			int n = in.nextInt();
			
			for(int j =0;j<n;j++){
				int q = in.nextInt();
				int p = in.nextInt();
				price = price + q*p;
			}
			total = s+price;
			price = 0;
			System.out.println(total);
		}

	}

}
