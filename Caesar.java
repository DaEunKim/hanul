package hanul;

import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String N = in.nextLine();
		String N2 = null;
		
		for(int i=0;i<N.length();i++){
			
			int k =N.charAt(i)-3;
			if(k>=65 && k<=90){
				N2 = new Character((char)k).toString();
				System.out.print(N2);
			}
			
			if(k>90){
				N2 = new Character((char) ((char)k-26)).toString();
				System.out.print(N2);
			}
			if(k<65){
				N2=new Character((char) ((char)k+26)).toString();
				System.out.print(N2);
			}
			
		}
		
	}

}
