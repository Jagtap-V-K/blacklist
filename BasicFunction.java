/*
    functions and method (class) are no different things in java
    as whole code of java is always written in classes only (not like C)

    Syntax:
        returnType main (type param1, type param2) {
            //function call
        }
        returnType name (type param1, type param2) {
            //function definition
            //return 0;     return 1;       all are okay
        }

    user defined:- add, substract, factorial
    in built:- Math(max, min, sqrt), sc.nextInt();

*/


import java.util.*;
public class BasicFunction{
    public static void main(String args[]){
        
        //type 1: without argument without return type
        op1();
        
        //type 2: with argument without return type
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        op2(a,b);

        //type 3: without argument with return type
        int c = op3();
        System.out.println(c);

        //type 4: with argument with return type
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int e = s.nextInt();
        int f = op4(d,e);           // actual parameters
        System.out.println(f);

        //recurssive
    }

    
    // type1
    public static void op1(){
        System.out.println("I feeling too dizzy right now");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    // type2
    public static void op2(int x, int y){
        int c = x + y;
        System.out.println(c);
    }
    
    // type3
    public static int op3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        
        return c;        
    }

    // type4
    public static int op4(int x, int y){        // formal parameters
        int c = x + y;
        return c;
    }

}