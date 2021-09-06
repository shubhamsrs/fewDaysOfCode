import java.util.*;
 
public class Main {
 
    public static int noOfDigit(long n)
    {
        if (n/10 == 0)
            return 1;
        else
            return 1 + noOfDigit(n / 10);
    }
 
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        int result = noOfDigit(number);
        System.out.print("Number of digits : "
                         + result);
    }
}
