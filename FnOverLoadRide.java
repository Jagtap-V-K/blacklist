/*
    Multiple function with same name but different parameter
    function overloading only depends on type of parameter and no of parameter
    does not depend on return type
    like
    
    public static float sum(int a, int b){

    }
    public static int sum(int a, int b){

    }

    -this will actually give an error
*/

//function overloading by varying with no of parameter
public class FnOverLoadRide{
    public static void main(String args[]){
        
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5));
       
        System.out.println(sum(4.02f,5,6));
        System.out.println(sum(4,5.6f));

    }
    public static float sum(float a, float b){
        return a + b;
    }

    public static float sum(float a, float b, float c){
        return a + b + c;
    }


    //function overloading by varying with no of parameter
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}