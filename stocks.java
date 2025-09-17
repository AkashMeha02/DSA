public class stocks {
    public static void buyandsellstocks(int[]preices){
        int max_sum= 0;
        int buyprice= preices[0];
        for(int i= 1;i<preices.length;i++){
            if(buyprice<preices[i]){
                int profit = preices[i]-buyprice;
                max_sum=Math.max(max_sum, profit);
            }else{
                buyprice=preices[i];
            }
        }
        System.out.println(max_sum);

    }
    public static void main(String[] args) {
        int[]preices={7,1,5,3,8,2,12,4};
        buyandsellstocks(preices);
    }
}
