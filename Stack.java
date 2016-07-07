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
			
			arr[i] = X;
			if(order.contains("push")){
				X = in.nextInt();
				count++;
				i++;
			}
			
			if(order.contains("size")){
				if(count<0)
					System.out.println("0");
				else
					System.out.println(count);
			}

			if(order.contains("pop")){
				count--;
				if(count<0){
					System.out.println("-1");
				}
				else{
					System.out.println(arr[i]);
				}
			}
			if(order.contains("empty")){
				if(count<=0)
					System.out.println("1");
				else
					System.out.println("0");
			}
			if(order.contains("top")){
				if(arr[i]<0)
					System.out.println("-1");
				else
					System.out.println(arr[i]);
			}
		}

	}

}
