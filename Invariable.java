package hanul;

import java.util.Scanner;

public class Invariable {
	public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char arr1[] = new char[3];
        char arr2[] = new char[3];
        String A = in.next();
        String B = in.next();
         
        for(int i=0; i<A.length();i++)
            arr1[i] = A.charAt(A.length()-i-1);
        
        for(int j=0; j<B.length();j++)
            arr2[j] = B.charAt(B.length()-j-1);
        
        
        String r1 = String.valueOf(arr1);
        String r2 = String.valueOf(arr2);
        
        int num1 = Integer.valueOf(r1);
        int num2 = Integer.valueOf(r2);
        
        if(num1 > num2)
        	System.out.println(num1);
        else
        	System.out.println(num2);
        
	}

}
