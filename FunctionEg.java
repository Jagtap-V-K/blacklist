public class FunctionEg{
    public static void main(String args[]){
        //java only supports call by value

        int a = 4;
        int b = 5;
        swap(a,b);
        System.out.println("a = " + a);     //a = 4
        System.out.println("b = " + b);     //b = 5

        System.out.println(factorial(5));


        System.out.println(binCoef(5, 2));
    }

    /*
        in call by value only values are copied hence
        in swap function value changes
        and in main function o/p value dosent changes
    */
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);     //a = 5
        System.out.println("b = " + b);     //b = 4
    }
    
    public static int factorial(int n){
        int f = 1;
        for( int i = 1; i <=n; i++){
            f = f*i;
        }
        return f;
    }

    //Binomial Coefficient (nCr)
    public static int binCoef(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int bc = a / (b * c);
        return bc;
    }
}