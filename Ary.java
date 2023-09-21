//  list of elements of same datatype placed in contigious location

//  dataType arrayName[] = new dataType[size];

//  array is an static element means no size can be changed while runtime

import java.util.*;
public class Ary{
    public static void main(String args[]){
        
        //Creatinga array
        String fruit[] = {"mango", "apple", "banana", "cherry"};
        int mark[] = new int[50];
        int n[] = {1,2,3,4};

        //input array
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        //output array
        for(int i=0; i<a; i++){     //a<4
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            // System.out.println(fruit[i]);
            // System.out.println(n[i]);
        }

        //update array
        int num[] = new int[10];
        // Scanner sc = new Scanner(System.in);

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);

        num[1] = num[1]+1;
        num[2] = 40;

        System.out.println(num[1]);
        System.out.println(num[2]);

        //length of array
        System.out.println("length of array num is " + num.length);
        
    }
}