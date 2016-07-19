package hanul;

import java.util.Scanner;

public class IOI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String IOI = in.nextLine();
		int count1=0;
		int count2=0;
		String J = "JOI";
		char arr[] = new char[10000];
		
		for(int i=0;i<IOI.length();i++){
			char s = IOI.charAt(i);
			arr[i] = s;
//			if(s=="JOI")
//				break;
			
			System.out.println(s);
		}
		
	}

}
