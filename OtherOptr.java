public class OtherOptr{
    public static void main(String args[]){

        //relational optr
        System.out.println(4 == 5);             //is equal to
        System.out.println(4 != 5);             //is not equal to
        System.out.println(4 < 5);              //less than
        System.out.println(4 > 5);              //greater than
        System.out.println(4 <= 5);             //less than equal to
        System.out.println(4 >= 5);             //greater than equal to

        //logical optr
        System.out.println(3>2 && 1<5);         // 1 & 1 = true
        System.out.println((3>2) && (5<1));     // 1 & 0 = false
        
        System.out.println(3>2 || 5<1);         // 1 or 0 = true
        System.out.println((3<2) || (5<1));     // 0 or 0 = false

        System.out.println(3>2);                //3 grater than 2 = true
        System.out.println(!(3>2));             //3 is not grater than 2 = false

        //assignment optr
        int a = 10;                             //assignment optr
        a += 10;                                //a = a + 10;   20
        a -= 10;                                //a = a - 10;   10
        a *= 10;                                //a = a * 10;   100
        a /= 10;                                //a = a / 10;   10
        a %= 10;                                //a = a % 10;   0

        System.out.println(a);

/*
        Operators                                       Precedence                      Associativity
        
        postﬁx increment and decrement                  ++ --                           left to right
        preﬁx increment and decrement, and unary        ++ -- + - ~ !                   right to left
        
        multiplicative                                  * / %                           left to right
        additive                                        + -                             left to right
        shift                                           << >> >>>                       left to right
        relational                                      < > <= >= instanceof	        left to right
        equality                                        == !=                           left to right
        
        bitwise AND                                     &                               left to right
        bitwise exclusive OR                            ^                               left to right
        bitwise inclusive OR                            |                               left to right
        
        logical AND                                     &&                              left to right
        logical OR                                      ||                              left to right
        
        ternary                                         ?:                              right to left
        assignment                                      = += -= *= /= %= &=             right to left
                                                        ^= |= <<= >>= >>>=
*/
    }
}