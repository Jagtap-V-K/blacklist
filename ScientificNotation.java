public class ScientificNotation{
    public static void main(String args[]){

        int decimalValue = 26;          // 26 in decimal representation
        int hexadecimalValue = 0x1a;    // 26 in hexadecimal representation
        int binaryValue = 0b11010;      // 26 in binary representation
        System.out.println(decimalValue);
        System.out.println(hexadecimalValue);
        System.out.println(binaryValue);

        double d1 = 1.234e1;
        double d2 = 1.234e+2;   //multiplied by 10 pow +2
        double d3 = 6.022E1;
        double d4 = 6.022E+2;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        double d6 = 314159e-01;
        double d7 = 314159e-2;  //multiplied by 10 pow -2
        double d8 = 314159E-03;
        double d9 = 314159E-4;
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        
    }
}