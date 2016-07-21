package hanul;
import java.util.Scanner;
public class ex {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int N = in.nextInt();
		String arr1[] = new String[100];
		char arr2[] = new char[100];
		
		for(int i=0;i<N;i++){
			arr1[i] = in.next();
			
			for(int j=0;j<arr1[i].length();j++){
				arr2[j] = arr1[i].charAt(arr1[i].length()-j-1);
			}
			
			for(int j=0;j<arr1[i].length();j++){
				System.out.print(arr2[j]);
			}
			
		}
	}
}
