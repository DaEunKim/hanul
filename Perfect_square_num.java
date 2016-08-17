package hanul;

import java.util.Scanner;

public class Perfect_square_num {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int arr[] = new int[10000];
		int sum =0;
		
		double a = Math.sqrt(M);
		double b = Math.sqrt(N);
		int a1 = (int)a;
		int b1 = (int)b;
		
		for(int i=a1+1;i<=b1;i++){
			arr[i] = i*i;
			if(arr[i]>=M && arr[i]<=N)
				sum += arr[i];
			else
				System.out.println("-1");
		}
		System.out.println(sum);
		System.out.println(arr[a1+1]);
	}
}
