public class BuyNSellStock{
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        System.out.println(Bns(price));
    }
    public static int Bns(int price[]){
        int BuyP = Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0; i<price.length; i++){
            if(BuyP < price[i]){
                int P = price[i] - BuyP;
                maxP = Math.max(maxP, P);                
            }
            else{
                BuyP = price[i];
            }
        }
        return maxP;
    }
}