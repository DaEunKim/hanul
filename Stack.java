package hanul;

import java.util.Scanner;

public class Stack {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int N = in.nextInt();
		int count=0;
		int arr [] = new int[N];
		int X=0;
		for(int i =0;i<N;i++){
			String order = in.next();
			
			if(order.contains("push")){
				X = in.nextInt();
				arr[count] = X;
				count++;
			}
			
			if(order.contains("size")){
				if(count<0)
					System.out.println(0);
				else
					System.out.println(count);
			}

			if(order.contains("pop")){
				if(count<=0){
					System.out.println(-1);
				}
				else{
					count--;
					System.out.println(arr[count]);
				}
			}
			if(order.contains("empty")){
				if(count<=0)
					System.out.println(1);
				else
					System.out.println(0);
			}
			if(order.contains("top")){
				if(count<=0)
					System.out.println(-1);
				else
					System.out.println(arr[count-1]);
			}
		}

	}

}
