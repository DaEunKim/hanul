package hanul;

import java.util.Scanner;

public class Five_vs_Six {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		
		String C1 = A.replace("6", "5");
		String C2 = B.replace("6", "5");
		
		int min = Integer.parseInt(C1) + Integer.parseInt(C2);
		
		String D1 = A.replace("5", "6");
		String D2 = B.replace("5", "6");
		int max = Integer.parseInt(D1) + Integer.parseInt(D2);
		
		System.out.println(min+" "+max);
		}
}
