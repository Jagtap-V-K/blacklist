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
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        //print boundaries
        while(startRow <= endCol && startCol <= endCol) {
            for(int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1; j>=startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1; i>startRow; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++; startRow++;
            endCol--; endRow--;
        }

        System.out.println();

        
    }
}