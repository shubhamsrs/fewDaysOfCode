import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
	    isPalindrome(number);
		
	}
	
	public static void isPalindrome(int n){
	    int reverseNum=0;
	    int y=n;
	    while(n!=0){
	        int r=n%10;
	        n=n/10;
	        reverseNum=(reverseNum*10)+r;
	        
	    }
	    
	    if(y==reverseNum)
	        System.out.println("isPalindrome");
	   else
	    System.out.println("Not");
	    
	}
}
