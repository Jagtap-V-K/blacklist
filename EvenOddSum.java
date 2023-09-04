import java.util.*;

public class EvenOddSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n, choice;
        int esum = 0;
        int osum = 0;

        do{
            System.out.println("Enter the no");
            n = sc.nextInt();

            if(n%2 == 0){
                esum += n;
            }
            else{
                osum += n;
            }
            System.out.print("do you want to continue? press 1 for yes & 0 to exit");

                choice = sc.nextInt();
        }while(choice == 1);

        System.out.println("even sum is " + esum);
        System.out.println("eodd sum is " + osum);
    }
}