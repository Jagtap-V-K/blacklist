//Bubble sort       basic
//Selection sort       basic
//Insertion sort       basic
//Counting sort     advance


import java.util.Arrays;
import java.util.Collections;

public class Sorting{
    public static void main(String args[]){
    int a[] = {5, 4, 1, 3, 2};
    Integer b[] = {6, 9, 7, 8, 5, 4, 1, 3, 2};
    
    //Bubble - Large element come to the end of
    //array by swapping with adjacent element
    /*for(int i=0; i<(a.length-1); i++){
        for(int j=0; j<(a.length-1-i); j++){
            if(a[j]>a[j+1]){
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            }
        }
    }
    for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }*/

    //selection - pick smallest of put it in 1st
    //position
    /*for(int i=0; i<a.length-1; i++){
        int minPos =i;
        for(int j=i+1; j<a.length; j++){
            if(a[minPos]>a[j]){     // < gives reverse sorted
                minPos = j;
            }
        }
        int temp = a[minPos];
        a[minPos] = a[i];
        a[i] = temp;
    }
    for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }*/


    //Incertion- Pick an element from unsorted part
    //& place in the right position in sorted part
    /*for(int i=1; i<a.length; i++){
        int CurrNo = a[i];
        int PrevNo = i-1;
        while(PrevNo >= 0 && a[PrevNo] > CurrNo){
            a[PrevNo + 1] = a[PrevNo];
            PrevNo--;
        }
        a[PrevNo + 1] = CurrNo;
    }
    for(int i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }*/

    //Inbuilt - only ascending
    //TC = O(n*logn)
    /*Arrays.sort(b);
    // Arrays.sort(b, 0, 4);   // will sort upto 4th index i.e. 0 1 2 3
    for(int i=0; i<b.length; i++){
        System.out.print(b[i]+" ");
    }*/

    //for reverse
    //as off reverse order function only works on objects
    //so we need to conver int(primtive) to Integer(Object)
    // Arrays.sort(b, Collections.reverseOrder());
    Arrays.sort(b, 2, 7, Collections.reverseOrder());
    for(int i=0; i<b.length; i++){
        System.out.print(b[i]+" ");
    }





    }
}