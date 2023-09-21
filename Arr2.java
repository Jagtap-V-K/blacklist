import java.util.*;

public class Arr2{
    public static void main(String args[]){

        //in java only call by reference is there no call by value
        int marks[] = {96, 97, 98};
        int a = 5;
        update(marks, a);
        System.out.println(a);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
    }

    public static void update(int marks[], int a){
        a = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 2;
        }
    }

}