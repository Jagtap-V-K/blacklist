//Bubble sort       basic
//Selection sort       basic
//Insertion sort       basic
//Counting sort     advance

public class Sorting{
    public static void main(String args[]){
    
    //Bubble - Large element come to the end of
    //array by swapping with adjacent element
    int a[] = {5, 4, 1, 3, 2};
    for(int i=0; i<(a.length-1); i++){
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
    }
    }
}