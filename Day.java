package hanul;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();//month
		int y= in.nextInt();//day
		if(x==1 && x==3 && x==5 && x==7 && x==8 && x==10 && x==12){
			
			for(y=1;y<=31;y++){
				if(y%7==1){
					System.out.println("MON");
					break;
				}
				if(y%7==2){
					System.out.println("TUE");
					break;
				}
				if(y%7==3){
					System.out.println("WED");
					break;
				}
				if(y%7==4){
					System.out.println("THU");
					break;
				}
				if(y%7==5){
					System.out.println("FRI");
					break;
				}
				if(y%7==6){
					System.out.println("SAT");
					break;
				}
				if(y%7==0){
					System.out.println("SUN");
					break;
				}
			}
		}
			if(x==2){
				for(y=1;y<=28;y++){
					if(y%7==1){
						System.out.println("MON");
						break;
					}
					if(y%7==2){
						System.out.println("TUE");
						break;
					}
					if(y%7==3){
						System.out.println("WED");
						break;
					}
					if(y%7==4){
						System.out.println("THU");
						break;
					}
					if(y%7==5){
						System.out.println("FRI");
						break;
					}
					if(y%7==6){
						System.out.println("SAT");
						break;
					}
					if(y%7==0){
						System.out.println("SUN");
						break;
					}
					
				}
				}
				if(x==4 && x==6 && x==9 && x==11){
					for(y=1;y<=30;y++){
						if(y%7==1){
							System.out.println("MON");
							break;
						}
						if(y%7==2){
							System.out.println("TUE");
							break;
						}
						if(y%7==3){
							System.out.println("WED");
							break;
						}
						if(y%7==4){
							System.out.println("THU");
							break;
						}
						if(y%7==5){
							System.out.println("FRI");
							break;
						}
						if(y%7==6){
							System.out.println("SAT");
							break;
						}
						if(y%7==0){
							System.out.println("SUN");
							break;
						}
						}
				}
		
		
	}

}
