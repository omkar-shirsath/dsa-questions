public class buyandsellstocks {
    public static int buyandsellstock(int pri []){
        int buyprice = Integer.MAX_VALUE;
        int mp = 0;

        for(int i = 0;i<pri.length;i++){
            if(pri[i] > buyprice){
                int profit = pri[i]-buyprice;
                mp = Math.max(mp,profit);
            }else{
                buyprice = pri[i];
            }
        }
        return mp;
    }
    public static void main(String args[]){
        int prices []={7,1,5,3,6,4};
        System.out.println(buyandsellstock(prices));
    }
}
