package hanul;
import java.util.Scanner;

public class Parenthesis {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int count=0;
        String arr[] = new String[50];
         
        for(int i=0;i<T;i++){
            String VPS = in.next();
            for(int j=0;j<VPS.length();j++){
            	String a = String.valueOf(VPS.charAt(j));
            	if(a=="("){
            		count++;
            	}
            	if(a==")")
            		count--;
            }
            if(count==0){
                System.out.println("YES");
            }
             
            if(count<0){
                System.out.println("NO");
            }
        }
 
    }
 
}