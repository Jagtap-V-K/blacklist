/*
    functions and method are no different things in java
    as whole code of java is always written in classes only (not like C)
*/

public class BasicFunction{     //java class name BasicFunction

    /*
        main function with void as a return type taking string arguments as input;
        public static is the access modifire
    */    
    public static void main(String args[]){
        op();
        ops();
    }

    
    public static void op(){
        System.out.println("I feeling too dizzy right now");
        //return (may or may not written)
    }

    
    public static int ops(){
        System.out.println("I feeling too dizzy right now");
        System.out.println("I feeling too dizzy right now");
        System.out.println("I feeling too dizzy right now");
        return 3;       //for int return type always need return type
        //return 0;     return 1;       all are okay
    }

    //------------------------------TYPE 1: Without Argument Without Return Type-------------------------------------//
    /*  Syntax:
        returnType name () {
            //body
            return statment;
        }
    */

}