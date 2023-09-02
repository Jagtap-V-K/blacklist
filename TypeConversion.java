import java.util.*;

public class TypeConversion{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        /*  Type conversion takes place when
            1. type compatible
            2. destination type > source type   
            
            byte < short < int < float < long < double      */

        
        // implicit type conversion
        int a = 45;
        long l = a;
        System.out.println(l); // allowed as int(4) < long(8)

        /*  byte    1           double  8
            short   2           long    8
            int     4           char    2
            float   4           boolean 1   */

        /* 
        double d = 31678;
        short s = d;
        System.out.println(s);  // error: incompatible types: possible lossy conversion from double to short
        */

    }
}