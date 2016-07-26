package hanul;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int multi = A*B*C;
		int count0=0, count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0;
		
		String m = String.valueOf(multi);
		char arr[] = new char[m.length()];
		for(int i=0; i<m.length();i++){
            arr[i] = m.charAt(i);
            String r1 = String.valueOf(arr[i]);

            if(arr[i]=='0'){
            	count0++;
            }
            if(arr[i]=='1'){
            	count1++;
            }
            if(arr[i]=='2'){
            	count2++;
            }
            if(arr[i]=='3')
            	count3++;
            if(arr[i]=='4')
            	count4++;
            if(arr[i]=='5')
            	count5++;
            if(arr[i]=='6')
            	count6++;
            if(arr[i]=='7')
            	count7++;
            if(arr[i]=='8')
            	count8++;
            if(arr[i]=='9')
            	count9++;

		}
		System.out.println(count0);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
		

	}

}
