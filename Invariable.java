package hanul;

import java.util.Scanner;

public class Invariable {

		public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			char arr1[] = new char[100];
			char arr2[] = new char[100];
			String A = in.next();
			String B = in.next();
			
			if(A!=B){
			for(int i=0;i<A.length();i++){
				arr1[i] = A.charAt(A.length()-i-1);
			}
			for(int j=0;j<B.length();j++){
				arr2[j] = B.charAt(B.length()-j-1);
			}
			for(int z=0; z<A.length(); z++){
				if((int)arr1[0] != (int)arr2[0]){
					if((int)arr1[z] < (int)arr2[z]){
						System.out.println(arr2);
						return;
					}
					else{
						System.out.println(arr1);
					}
					
				}
			}
		}
	}
}
