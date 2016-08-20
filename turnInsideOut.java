package hanul;

import java.util.Scanner;

public class turnInsideOut {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		char arr[] = new char[M];
		String shape = null;
		
		for(int i=0;i<N;i++){
			shape = in.next();
			
			for(int j=0;j<M;j++){
				arr[j]=shape.charAt(shape.length()-j-1);
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		


	}

}
