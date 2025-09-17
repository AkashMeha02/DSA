public class spiral {
    public static void generateMatrix(int n) {
        int[][]matrix=new int[n][n];
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom =matrix.length-1;
        int i=1;

        while(left<=right&&top<=bottom){
            for(int j=left;j<=right && i<=n*n;j++){
                matrix[top][j]=i++;
                
            }
            top++;
            for(int j=top;j<=bottom && i<=n*n;j++){
                matrix[j][right]=i++;
                
            }
            right--;
            if(top<=bottom && i<=n*n){
                for(int j=right;j>=left && i<=n*n;j++){
                    matrix[bottom][j]=i++;
                    
                }
                bottom--;
            }
            if(left<=right && i<=n*n){
                for(int j=bottom;j>=top && i<=n*n;j--){
                    matrix[j][left]=i++;
                    
                }
                left++;
            }
        }
        for(int k=0;k<n;k++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n =3;
        generateMatrix(n);
    }
    
}
