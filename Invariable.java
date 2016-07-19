package hanul;

import java.util.Scanner;

public class Invariable {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		int max=0;
		char arr1[] = new char[3];
		char arr2[] = new char[3];
		int val1 =0;
		int val2 = 0;
		if(A!=B){
		for(int i=0;i<A.length();i++){
			arr1[i] = A.charAt(i);
			char temp1 = arr1[0];
			arr1[0] = arr1[A.length()-1];
			arr1[A.length()-1] = temp1;
		}
		
		for(int i=0;i<B.length();i++){
			arr2[i] = B.charAt(i);
			char temp2 = arr2[0];
			arr2[0] = arr2[B.length()-1];
			arr2[B.length()-1] = temp2;
			
		}}
		
		val1=Integer.valueOf(arr1[0]-48);
		val2=Integer.valueOf(arr2[0]-48);
		
		if(val1<val2 && val1!=0 && val2!=0){
			max=val2;
			System.out.print(max);
			System.out.print(arr2[1]);
			System.out.println(arr2[2]);
		}
		
		else if(val1>val2 && val1!=0 && val2!=0){
			max=val1;
			System.out.print(max);
			System.out.print(arr1[1]);
			System.out.println(arr1[2]);
			
		}
}
}
