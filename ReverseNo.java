import java.util.*;

public class ReverseNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem;

        //just to print
        while(n>0){
            rem = n%10;
            n = n/10;
            System.out.print(rem);
        }

        //reverse the orignal no itself
        int rev=0;
        while(n>0){
            rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        System.out.print(rev);
    }
}