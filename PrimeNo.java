import java.util.*;
public class PrimeNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean isPrime = true;

        // add neither prime not composite
        if(n == 2){
            System.out.println(n + " is prime");
        }

        else{

            for(int i = 2; i <= (n/2); i++){        //Math.sqrt(n)
                if(n % i == 0){                   //n is a multiple of i (where i is not equal to 1)
                    isPrime = false;
                }
            }
        
            if(isPrime == true){
                System.out.println(n + " is prime");
            }
            else{
                System.out.println(n + " is not prime");
            }

        }
    }
}