package hanul;

import java.util.Scanner;

public class IOI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String I = in.nextLine();
		//int count[]= new int[1000];
		int count1 [] = new int [1000];
		int count2 [] = new int[1000];
		
		for(int i=0;i<I.length();i++){
			
			if(I.contains("JOI")==true)
				count1[I.indexOf("JOI")]++;
			if(I.contains("IOI")==true)
				count2[I.indexOf("JOI")]++;
			
		
			
		}
		System.out.println(count1);
		
	}

}
