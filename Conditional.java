import java.util.*;

public class Conditional{
    public static void main(String args[]){

        //income tax calculator
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax = 0;
        }
        else if(income>500000 && income<1000000){
            tax = (int)(income * 0.2);
        }
        else{
            tax = (int)(income * 0.3);
        }
        System.out.println("your tax is = "+ tax);

        //ternary optr another metod to write if else
        //variable = condition ?(if true then) statement1 :(else) statment2
        int num = sc.nextInt(); 
        String a = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(a);

        /*
        switch (variable){
            case '+':
                break;
            case a:
                break;
            case 1:
                break;
            default:
                break;
        }*/

        //calculator
        int a = sc.nextInt();
        int b = sc.nextInt();

        char ch = sc.nextChar;
        switch(ch){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default : System.out.println("Enter valid operator")
        }

        //leap year or not
        int year = sc.nextInt();
        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if(x && (y || z)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}