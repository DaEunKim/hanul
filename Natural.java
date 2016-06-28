package hanul;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		if(N>1 && N<100000){
			for(int i=N;i>0;i--){
			System.out.println(i);
			}
		}
		

	}

}
