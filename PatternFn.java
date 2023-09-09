public class PatternFn { 
    public static void HollowRectangle(int totRows, int totCols) { 
        //outer loop
        for(int i=1; i<=totRows; i++) { 
            //inner columns 
            for(int j=1; j<=totCols; j++) { 
                //cell- (1,1) 
                if(i == 1 || 1 == totRows || j == 1 || j == totCols) { 
                    //boundary cells                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        HollowRectangle(5, 5);
    }
}