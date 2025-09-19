import java.util.*;
public class mergeintervals{
    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int[] curr = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            
            if (curr[1] >= arr[i][0]) {
                curr[1] = Math.max(curr[1], arr[i][1]);
            }else {
                result.add(curr);
                curr = arr[i];
            }
        }
        result.add(curr);

        return result;
    }  
    public static void main(String[] args) {
        
        int[][] arr = {{1,3},{2,4},{6,8},{9,10}};
        
        ArrayList<int[]> ans = mergeOverlap(arr);
        System.out.println("Merged Intervals:");
        for (int[] interval : ans) {
            System.out.println(Arrays.toString(interval));
        }
    }
}

    

