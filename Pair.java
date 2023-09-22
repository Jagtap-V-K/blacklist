import java.util.*;
public class Pair{
    public static void main(String args[]){
        int a[] = {2, 4, 6, 8, 10};
        Pp(a);
    }

    //tc = O(n^2)
    public static void Pp(int a[]){
        int cnt = 0;
        for(int i=0; i<a.length; i++){
            int currentNum = a[i];
            for(int j=i+1; j<a.length; j++){
                System.out.print("("+currentNum+","+a[j]+") ");
                cnt++;
            }
            System.out.println(); 
        }
        System.out.print(cnt);      //count logic = n(n-1)/2        Basic Arithmatic Progression formula
    }
}
