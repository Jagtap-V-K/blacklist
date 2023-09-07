public class FnIsPrime{
    public static void main(String args[]){
        //method 1
        System.out.println(ispme(5));
        //method 2
        System.out.println(isprime(5));
    }

    public static boolean ispme(int n){
        boolean p = true;
        if(n == 2){
            return p;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                p = false;
            }
        }
        return p;
    }

    public static boolean isprime(int n){
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}