import java.util.*;
 public class PatternFn { 
    public static void main(String args[]) {
        // HollowRectangle(5, 5);
        // Pyramid(5);
        // for(int i = 1; i<=5; i++){
        //     for(int j = 1; j<=5-i+1; j++){
        //         System.out.print(j);
        //     }
        //         System.out.println();
        // }
        // Floyd();
        //diamond
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //spaces
            for(int j =1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j =1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }    

        //2nd half
        for(int i = n-1; i >= 1; i--){
            //spaces
            for(int j =1; j <= (n-i) ; j++){
                System.out.print(" ");
            }
            //star
            for(int j =1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }            

    // public static void HollowRectangle(int totRows, int totCols) { 
    //     for( int i = 1; i <= totRows; i++ ) { 
    //         for( int j = 1; j <= totCols; j++ ) { 
    //             if( i == 1 || i == totRows || j == 1 || j == totCols ) {                               
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();  
    //     }   
    // }

    // public static void Pyramid(int line) { 
    //     for( int i = 1; i <= line; i++ ) {         
    //         for( int j = 1; j <= line - i; j++ ) { 
    //                 System.out.print(" ");
    //             }
    //         for( int j = 1; j <= i; j++ ) { 
    //                 System.out.print("*");
    //             }
    //             System.out.println();  
    //         }
    //     }


    // public static void Floyd(){
    //     int n=1;
    //     for(int i = 1; i<=5; i++){                      //1
    //         for(int j = 1; j<=i; j++){                  //2     3
    //             System.out.print(n +"\t");              //4     5       6
    //             n++;                                    //7     8       9       10
    //         }
    //         System.out.println();
    //     }
        // for(int i = 1; i<=5; i++){                      //11    12      13      14
        //     for(int j = 5; j>=i; j--){                  //15    16      17
        //         System.out.print(n +"\t");              //18    19      
        //         n++;                                    //20
        //     }
        //     System.out.println();
        // }
        
}