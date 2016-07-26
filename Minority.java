package hanul;

import java.util.Scanner;

public class Minority {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int minor = 0;
		int num=0;

		
		for(int i=0;i<N;i++){
			num = in.nextInt();
			if(Test(num))
				minor+=1;
		}
		System.out.println(minor);
	}
	public static boolean Test(int num){
		if(num==1)
			return false;
		if(num==2)
			return true;
	
		for(int i=2; i<num; i++){
			if(num%i==0)
				return false;
			if(num%num==0 && num/1==num)
				return true;
		}
		return true;
	}
}
