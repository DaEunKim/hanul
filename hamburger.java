package hanul;

import java.util.Scanner;

public class hamburger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int burger;
		int drink;
		
		int min1=20113336;
		int min2= 999;
		for(int i=0;i<3;i++){
			burger=in.nextInt();
			if(burger<min1){
				min1=burger;
			}
		}
		for(int j=3;j<5;j++){
			drink = in.nextInt();
			if(drink<min2){
				min2=drink;
			}
		}
		System.out.println(min1+min2-50);

	}

}
