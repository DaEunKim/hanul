package hanul;

import java.util.Scanner;

public class RoomNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		int count [] = new int[10];
		String A = N.replace("6", "9");
		
		for(int i=0;i<N.length();i++){
			count[Integer.parseInt(A.charAt(i)+"")]++;
			
		}
		if(count[9]%2==1)
			count[9]++;
		count[9] = count[9]/2;
		
		int max=0;
		for(int i=0;i<10;i++){
			if(max<count[i])
				max = count[i];
		}
		System.out.println(max);
	}

}
