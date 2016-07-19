package hanul;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int N = in.nextInt();
		char arr1[] = new char[50];
		char arr2[] = new char[50];
		int count=10;
		for(int i=0;i<N;i++){
			String S = in.next();
			for(int j =0; j<S.length(); j++){
				arr1[j] = S.charAt(j);
				//System.out.println(arr1[j]);
				arr2[count--] = arr1[j];
				char k = arr2[count];
				System.out.println(k);
			}
		}

	}

}
