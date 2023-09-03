import java.util.*;

public class InputOutput{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        sc.nextLine(); // get rid of empty newline char
        String a = sc.next();
        System.out.println(a);

        byte b = sc.nextByte();
        System.out.println(b);

        int num = sc.nextInt();
        System.out.println(num);
        
        float f =sc.nextFloat();
        System.out.println(f);
        
        short s = sc.nextShort();
        System.out.println(s);

        long l = sc.nextLong();
        System.out.println(l);
        
        double d = sc.nextDouble();
        System.out.println(d);

        boolean var = sc.nextBoolean();
        System.out.println(var);
    }
}