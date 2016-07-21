package hanul;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String pal = in.next();
		char tmp[] = new char[100];
		char arr[] = new char[100];
		for(int i=0;i<pal.length();i++){
			tmp[i] = pal.charAt(i);
		}
		for(int j=0;j<pal.length();j++){
			arr[j] = pal.charAt(pal.length()-j-1);
		}
		String r1 = String.valueOf(tmp);
        String r2 = String.valueOf(arr);
		if(r1.equals(r2))
			System.out.println("1");
		else
			System.out.println("0");
	       

	}

}
