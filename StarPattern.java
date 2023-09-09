import java.util.*;
public class StarPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

/*
        // left triangle
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // left inverted triangle
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j < n-i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }


import java.util.Scanner;
public class SecondPattern
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Please provide number of rows to print... ");
int myrows = scanner.nextInt();
System.out.println("\nThe star pattern is... ");
for (int m = 1; m <= myrows; m++)
{
for (int n = myrows; n > m; n--)
{
System.out.print("*");
}
System.out.println();
}
}
}


        // right triangle
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
        }


*/



        //hollow square
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n ){
                    System.out.println("*");
                }
                System.out.println();
            }
        }
    }
}