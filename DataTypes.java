public class DataTypes{
    public static void main(String args[]){
        // java is typed language where we need to declear type of variable

        //primitive
        byte b = 8;             // 1     -128 to 127
        short s = 32767;        // 2     -32,768 to 32,767
        int a = 10;            // 4     -2^31 to 2^31 -1
        float price = 10.2f;    // 4     1.4e-045 to 3.4e+048
        double d1= 123.4;       // 8     4.9e-324 to 1.8e+308
        long l = 98765432;     // 8     -2^63 to 2^63 -1

        char ch = 'C';          // 2     0 to 65,535
        boolean var = true;     // 1     true or false  1 or 0

        System.out.println(b);
        System.out.println(s);
        System.out.println(a);
        System.out.println(price);
        System.out.println(d1);
        System.out.println(l);
        System.out.println(ch);
        System.out.println(var);

        // non primitive
        // string, array, class, object, interface
    }
}