import java.util.*;
public class D2Ary{
    public static void main(String args[]){

        int a[][] = new int[3][4];
        int n = a.length;       //3
        int m = a[0].length;    //4
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}