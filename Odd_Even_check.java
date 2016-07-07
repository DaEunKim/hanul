package hanul;

import java.util.Scanner;

public class Odd_Even_check {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=0;i<N;i++){
			String K = in.next();
			int L=0;
			for(int j=0;j<K.length();j++){
				String last = K.substring(K.length()-1);
				L = Integer.parseInt(last);
			}
			if(L%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
			
		}

	}

}
