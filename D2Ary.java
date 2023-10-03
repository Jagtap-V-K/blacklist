import java.util.*;
public class D2Ary{
    public static void main(String args[]){

        /*int a[][] = new int[3][4];
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
        }*/



        //Spiral Matrix
        int a = { 
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int startRow = 0;
        int endRow = a.length - 1;
        int startCol = 0;
        int endCol = a[0].length - 1;

        while(startRow <= endRow && startCol <=endCol){
            
            for(int j =startCol; j<=endCol; j++ ){
                system.out.print(a[startRow][j] +" ");
            }
            for(int i =startRow+1; i<=endRow; i++ ){
                system.out.print(a[i][endCol] +" ");
            }
            for(int j =endCol -1; j<=startCol; j-- ){
                system.out.print(a[endRow][j] +" ");
            }
            for(int i =endRow-1; j<=startRow+1; j--){
                system.out.print(a[i][startCol] +" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }

        

        
    }
}