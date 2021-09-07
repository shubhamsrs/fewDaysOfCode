import java.util.*;
 
public class Main {
 
    public static void sumOddEven(int n){
        int sumodd=0;
        int sumeven=0;
        int count=1;
        while(n!=0){
            if(count%2==0){
                sumeven+=n%10;
            }
            
            else{
                sumodd+=n%10;
            }
            n=n/10;
            count++;
                
        }
        
        System.out.println("Sum of odd places "+sumodd);
        System.out.println("Sum of even places "+sumeven);
        
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number greater than 10 :->");
        int number = sc.nextInt();
        sumOddEven(number); 
    }
}
