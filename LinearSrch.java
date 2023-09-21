import java.util.*;

public class LinearSrch{

    public static int LinSer(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(key == num[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        //find the index of an element in a given array        
        int num[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        int index = LinSer(num, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index = " + index);
        }    
    }
}