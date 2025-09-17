public class kadanes {
    public static void Kadan(int[]numbers){
        int currsum= 0;
        int max_sum= Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++){
            currsum+=numbers[i];
            if(currsum<0){
                currsum=0;
            }
            max_sum= Math.max(max_sum, currsum);
        }
        if(max_sum == 0){
            int first = numbers[0];
            for(int i = 1;i<numbers.length;i++){
                if(first<numbers[i]){
                    first = numbers[i];
                }
            }
            max_sum=first;
        }
        System.out.println("maxsum. : " + max_sum);
    }
    public static void main(String[] args) {
        int[]numbers = {-2,-1,7,-7,9,-9};
        Kadan(numbers);

    }
    
}
