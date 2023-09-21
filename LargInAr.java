import java.util.*;
public class LargInAr{
    public static void main(String args[]){
        int a[] = {40, 2, 4, 5, 100, 6, 7, 8, 9};
        // int max = ;
        System.out.println("max is = " + Biggest(a) + " at location = ");
    }
    public static int Biggest(int a[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }

            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println(min);
        return max;
    }
}