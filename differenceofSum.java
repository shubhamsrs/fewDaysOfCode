import java.util.*;

public class Main
{
	public static int differenceofSum(int n,int m){
	    int sum1=0,sum2=0;
	    for(int i=1;i<=m;i++){
	        if(i%n==0){sum1=sum1+i;}
	        else
	            sum2+=i;
	    }
	    
	    
	    return Math.abs(sum2-sum1);
	    
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the first number -> ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter the first number -> ");
		int m = input.nextInt();
		int rsum = differenceofSum(n,m);
		System.out.println("The difference is -> "+rsum);
		
	}
}
