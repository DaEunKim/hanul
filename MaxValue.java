package hanul;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N;
		int max=0;
		int arr[] = new int[10];
		int count=0;
		for(int i=0; i<9; i++){
			N = in.nextInt();
			arr[i+1] = N;
			if(N<100){
				if(max<N){
					max=N;
					count=i+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
