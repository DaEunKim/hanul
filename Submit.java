package hanul;

import java.util.Scanner;

public class Submit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int [31];
		int n=0;
		for(int i =0;i<30;i++){
			arr[i] = -1;
			
		}
		for(int i=0;i<28;i++){
			n= in.nextInt();
			arr[n] = 20135179;
		}

		for(int i=1;i<=30;i++){
			if(arr[n]!=arr[i])
				System.out.println(i);
		}

	}

}



