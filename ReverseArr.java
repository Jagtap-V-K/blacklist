import java.util.*;
public class ReverseArr{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int len = sc.nextInt();
        int a[] = new int[len];

        System.out.println("Enter array elements: ");
        for(int i=0; i<len; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array entered is = ");
        for(int i=0; i<len; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //to reverse an array
        //time complexity (TC) = O(n)
        /*int b[] = new int[len];
            int j = len;
        for(int i=0; i<len; i++, j--){
            b[j-1] = a[i];
            // j -= 1;
        }
        System.out.print("Reversed array is = ");        
        for(int i=0; i<len; i++){
            System.out.print(b[i]+" ");
        }*/

        //to reverse an array
        //time complexity (TC) = O(n)/2
        int start = 0, end = len-1;
        for(int i=0; i<len-1; i++, start++, end--){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        System.out.print("Reversed array is = ");
        for(int i=0; i<len; i++){
            System.out.print(a[i]+" ");
        }
        



        // Scanner.close();
    }
}