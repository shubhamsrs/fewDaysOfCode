import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check weather it's palindrome or not : ");
		int number = input.nextInt();
	    System.out.println(palindrome(number));
		
	}
	
	public static int palindrome(int n){
	    int number = n, sum=0;
	    while(n!=0){
	        sum=(sum*10)+(n%10);
	        n=n/10;
	    }
	    
	    if(sum==number) return 1;
	    return 0;
	}
	
}
