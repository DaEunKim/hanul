package hanul;

import java.util.Scanner;

public class SequenceOfNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int arr[] = new int[10000];
		int sum=0;
		int incre = 0;
		int num = 1;
		
		for(int i=0;i<47;i++){
			int k = i+1;
			for(int j=0;j<k;j++){
				arr[incre] = num;
				incre++;
			}
			num++;		
		}
		for(incre=A-1;incre<B;incre++){
			sum += arr[incre];
		}
		System.out.println(sum);		
	}
}