/*Converting decimal number to binary
*/
import java.util.*;
public class Main
{
	public static void toBinary(int n){
	    if(n>1){
	        toBinary(n/2);
	        System.out.print(n%2);
	    }
	    if(n==0||n==1)
	        System.out.print(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        toBinary(n);

	}
}
