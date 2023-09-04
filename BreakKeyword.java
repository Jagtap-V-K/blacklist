import java.util.*;

public class BreakKeyword{
    public static void main(String args[]){
        //break is used to exit loop
        
        //get out of loop if no entred is multiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter next number");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
        }while(true);

    }
}