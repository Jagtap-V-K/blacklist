import java.util.*;

public class ContinueKeyword{
    public static void main(String args[]){
         //continue keyword is used to skip an iteration

         //dont print multiple of 5
         for(int i=0; i<100; i++){
            if(i%5 == 0){
                continue;
            }
            System.out.print(" " + i);
         }
    }
}