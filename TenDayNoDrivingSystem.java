package hanul;

import java.util.Scanner;

public class TenDayNoDrivingSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Day = in.nextInt();
		int count=0;
		for(int i=0;i<5;i++){
			int numCar = in.nextInt();
			if(numCar == Day){
				count++;
			}			
		}
		System.out.println(count);
	}

}
