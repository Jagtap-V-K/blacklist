//A continuous part of an array
import java.util.*;
public class SubArr{
    public static void main(String args[]){
        int a[] = {2, 4, 6, 8, 10};
        Sa(a);
    }

    //tc = O(n^3)
    public static void Sa(int a[]){
        int cnt = 0;
        for(int i=0; i<a.length; i++){
            // int start = i;
            for(int j=i; j<a.length; j++){
                // int end = j;
                System.out.print("(");
                // for(int k=start; k<=end; k++){
                for(int k=i; k<=j; k++){
                    System.out.print(" "+a[k]+" ");
                    cnt++;
                }
                System.out.println(") ");
            }
            System.out.println(); 
        }
        System.out.println(cnt);
    }

}
