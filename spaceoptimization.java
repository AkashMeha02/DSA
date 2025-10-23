import java.util.*;
public class spaceoptimization {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        int b =sc.nextInt();
        int size=Math.abs(b-a)+1;
        int[]arr=new int[size];

        for(int i=a;i<=b;i++){
            if(i%2==0||i%5==0){
                arr[i-a]=1;
            }
        }
        System.out.println("multiples of 2 and 5");
        for(int i=a;i<=b;i++){
            if(arr[i-a]==1){
                System.out.print(i+" ");
            }
        }
    }
}
