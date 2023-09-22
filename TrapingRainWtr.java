public class TrapingRainWtr{
    public static void main(String args[]){
        int heights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(Trw(heights));
    }

    //create left max boundry ary       - 4, 4, 4, 6, 6, 6, 6, 6 
    //create right max boundry ary      - 6, 6, 6, 6, 5, 5, 5, 5
    //now claculate wtrlvl = min(lMAxary, rMAXary)
    //and then ans = wtrlvl - total height of mid blocks

    public static int Trw(int heights[]){
        int h = heights.length;
        
        //left max ary
        int Lmax[] = new int[h];
        Lmax[0] = heights[0];
        System.out.print(Lmax[0] +" ");
        for(int i=1; i<h; i++){
            Lmax[i] = Math.max(heights[i], Lmax[i-1]);
            System.out.print(Lmax[i] +" ");
        }

        System.out.println();

        //right max ary
        int Rmax[] = new int[h];
        Rmax[h-1] = heights[h-1];
        for(int i=h-2; i>=0; i--){
            Rmax[i] = Math.max(heights[i], Rmax[i+1]);
        }
        for(int i=0; i<h; i++){
            System.out.print(Rmax[i] +" ");
        }

        //calculate trapwtr
        int tw = 0;
        for(int i=0; i<h; i++){
            int wlvl = Math.min(Lmax[i], Rmax[i]);   //trap water level
            tw += wlvl - heights[i];
        }
        return(tw);
    }
}