public class ArithmaticOptr{
    public static void main(String args[]){
        //binary = + - * / %

        //unary = ++ --
        int a=2;        //pre increment
        int b=++a;      //first a is incremented a=3 then assigned to b=a=3
        System.out.println(a);
        System.out.println(b);
        
        int c=5;        //post increment
        int d=c++;      //first d=c=5 is assigned then c is incremented to c=6
        System.out.println(c);
        System.out.println(d);

        int e=8;        //pre decrement
        int f=--e;      //first e is decremented e=7 then assigned to f=e=7
        System.out.println(e);
        System.out.println(f);

        int g=12;       //post decrement
        int h=g--;      //first g is assigned to h=g=12 then g is decremented to g=11
        System.out.println(g);
        System.out.println(h);
    }
}