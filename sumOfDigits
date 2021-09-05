import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    if(number<0)
	        return ;
	    int result = sumOfDigits(number);
	    System.out.println(result);
	    
		
	}
	
	public static int sumOfDigits(int number){
	    if(number<10)
	        return number;
	   else
	        return number%10+sumOfDigits(number/10);
	}
	    
}
