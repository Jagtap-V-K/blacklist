import java.util.*;

public class Binary{
    public static void main(String args[]){
        int a[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 4;
        System.out.println("Index of key "+key+" is = "+BinSrch(a, key));
    }

    public static int BinSrch(int a[], int key){
        int start = 0;
        int end = a.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            //comparision
            if(a[mid] == key){
                return mid;
            }
            if(a[mid] < key){   //key is greater than mid so search in right half
                start = mid + 1;
            }
            if(a[mid] > key){  //key is less than mid so search in left half
                end = mid - 1;
            }
        }
        return -1;
    }
}