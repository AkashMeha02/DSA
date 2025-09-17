public class container_with_most_water {
    public static int max_area(int[]height){
        int maxarea = 0;
        int i=0;
        int j= height.length-1;

        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            maxarea=Math.max(maxarea,area);
            if(height[i]<height[j]){
                i++;

            }else{
                j--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        System.out.println(max_area(height));
    }
    
}
