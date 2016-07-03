package hanul;

import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		String N2 = null;
		for(int i=0;i<N.length();i++){
			int k =N.charAt(i)-3;
			N2 = new Character((char)k).toString();
			System.out.print(N2);
		}
		
	}

}
