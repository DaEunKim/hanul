package hanul;

import java.util.Scanner;

public class AscendingSorting {//버블정렬 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int tmp=0;
		
		int arr[] = new int[1000];
		
		for(int i=0;i<N;i++){
			arr[i] = in.nextInt();
			
		}
	//	System.out.println();
		
		for(int j=0;j<N;j++){
			for(int i=1;i<N-j;i++){
				if(arr[i-1]>arr[i]){
					tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
			}
			
		}
		for(int i=0;i<N;i++){
			System.out.println(arr[i]);
		}
	}
}
