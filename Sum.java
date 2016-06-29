package hanul;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){

			int A = in.nextInt();
			int B = in.nextInt();
			
			int C=A+B;
			
			if(A==0 && B==0){
				break;
			}

			
			System.out.println(C);
			
			
		}
		
	}

}
