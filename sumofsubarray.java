public class sumofsubarray {
    public static void subarray(int[]numbers){
        int currsu = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++){
            for(int j =i;j<numbers.length;j++){
                currsu = 0;
                for(int k = i ;k<= j;k++){
                    currsu+= numbers[k];
                }
                System.out.println(currsu);
                if(max_sum<currsu){
                    max_sum = currsu;
                }
            }
        }
        System.out.println("maximum subarray: " + max_sum);
    }
    public static void main(String[] args) {
        int[] numbers= {2,4,6,8,10};
        subarray(numbers);
    }
}
