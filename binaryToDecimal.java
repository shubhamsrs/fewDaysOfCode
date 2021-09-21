/*Java program to convert a binary number to decimal number*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long binary = input.nextLong();
		long dec = 0;
		long r,j=1 ;
		
		while(binary!=0){
		    r=binary%10;
		    dec=dec+r*j;
		    j=j*2;
		    binary=binary/10;
		}
		
		System.out.println(dec);
	}
}
