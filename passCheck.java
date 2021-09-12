/*You are given a function.
int passCheck(String str,int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input:
aA1_67
Output:
1

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = input.nextLine();
	    System.out.println(passCheck(str,str.length()));
		
	}
	
	public static int passCheck(String str,int n){
	    if(n<4) return 0;
	    if(str.charAt(0)>='0' && str.charAt(0)<='9') return 0;
	    
	    int c1=0,c2=0;
	    
	    for(int i=0;i<n;i++){
	        if(str.charAt(i)==' '||str.charAt(i)=='/')
	            return 0;
	        if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
	            c1++;
	        if(str.charAt(i)>='0'&&str.charAt(i)<='9') 
	            c2++;
	    }
	    
	    if(c1>0 && c2>0) 
	        return 1;
	    else 
	        return 0;
	}
}
