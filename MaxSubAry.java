import java.util.*;
public class MaxSubAry{
    public static void main(String args[]){
        // int a[] = {1, -2, 6, -1, 3};
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Msa(a);
    }

    //  Brute force method      tc = O[n^3];
    /*public static void Msa(int a[]){
        int max = 0;
        for(int i=0; i<a.length; i++){
            int start = i;
            
            //for(int j=i; j<a.length; j++){
            for(int j=start; j<a.length; j++){
                int end = j;
                int crntSum = 0;
                System.out.print("(");
                
                // for(int k=i; k<=j; k++){
                for(int k=start; k<=end; k++){
                    System.out.print(" "+a[k]+" ");
                    crntSum += a[k];
                }
                
                if(max<crntSum){
                    max = crntSum;
                }
                System.out.println(") ");
                System.out.println(crntSum);
            }
            System.out.println(); 
        }
        System.out.println(max);
    }*/

    //  prefix sum method   tc = O[n^2]
    /*public static void Msa(int a[]){

        //calculate prefix array
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for(int i=1; i<a.length; i++){
            prefix[i] = prefix[i - 1] + a[i];
        }

        int crntSum = 0;
        int max = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){      //  i=start j=end
                
                // for start = 0; crntSum  = prefix[j]       i.e. prefix[end]
                crntSum = i == 0 ? prefix[j] : prefix[j] -prefix[i - 1];
                if(max<crntSum){
                    max = crntSum;
                }
            }
        }
        System.out.println(max);
    }*/

    //kadane's algorithm    tc = O[n]
    public static void Msa(int a[]){

        //HW = if all elements are -ve
        // for(int i = 0; i<a.length; i++){
        //     if(a[i]<0){
                
        //     }
        // }

        int crntSum = 0;
        int maxSum = 0;
        for(int i=0; i<a.length; i++){
                crntSum += a[i];                
                if(crntSum<0){
                    crntSum = 0;
                }
                maxSum = Math.max(crntSum, maxSum);
            }
            System.out.println(maxSum);  
        }
}