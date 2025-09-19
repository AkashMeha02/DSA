public class arraypalindrome{
    public static int count(int[]arr){
        int ans=0;
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                
                arr[j]+=arr[j-1];
                ans++; 
                j--;    
            }else{
                arr[i]+=arr[i+1];
                ans++;
                i++;

            }
        } 
        return ans;    
    }
    public static void main(String[] args) {
        int[]arr={11, 14, 15, 99};
        int result=count(arr);
        System.out.println("no. of operatins required to make the array a palindrome : "+ result);
    }
}