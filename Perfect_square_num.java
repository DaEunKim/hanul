package hanul;

import java.util.Scanner;

public class Perfect_square_num {

	public static void main(String[] args) {
						
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int square =0;
		int sum =0;
		int min = 110000;
	
		for(int i =1;i<=100;i++){
			square = i*i;
			if(square>=M && square<=N){
				sum+=square;
				if(min>square){
					min = square;
				}
			}
		}
		if(sum==0)
			System.out.println("-1");
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
