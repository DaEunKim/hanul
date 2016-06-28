package hanul;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int max=0;
		int min=20113336;
		for(int i=0;i<N;i++){
			int value=in.nextInt();
			if(value>max){
				max=value;
				}
			if(value<min){
				min=value;
				}
	}
		System.out.println(min + " "+ max);

}
}
