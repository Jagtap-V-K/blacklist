public class TypeCasting{
    public static void main(String args[]){

        //narrowing ecplicit type conversion
        float var = 42.666f;
        int num = (int) var;
        System.out.println(num);

        /* type promotion
        
        1.  java automatically promotes each byte short char operand to int
            when evaluating an expression
        2.  if any one operand is long, float or double whole expression is
            promoted to long, floar or double   */

        int a = 45;
        float b = 12.53f;
        long c = 20;
        double d = 15;

        //int sum = a+b+c+d;          //error: incompatible types: possible lossy conversion from double to int
        //int sum = (int) a+b+c+d;    //error: incompatible types: possible lossy conversion from double to int
        int sum = (int) (a+b+c+d);
        System.out.println(sum); 

    }
}