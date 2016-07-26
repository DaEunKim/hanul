package hanul;

import java.util.Scanner;

public class CoinCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int m =0;
		int arr[] = new int[10];
		
		int count=0;
		for(int i=0;i<N;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i=0;i<N;i++){
			m = K/arr[N-i-1];
			K-=m*arr[N-i-1];
			count+=m;
			
		}
		System.out.println(count);
	}
}
