package hanul;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSTL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int [] num = new int[N];
		
		for(int i=0;i<N;i++){
			num[i] = in.nextInt();
			
		}
		Arrays.sort(num);
		
		for(int i=0;i<N;i++){
			System.out.println(num[i]);
		}

	}

}
