package matrixTest;

public class Matrix5 {
    public static void main(String[] args) {
        int[][] mtx = new int[5][5];
        int k = 1;
        for (int i = mtx.length-1; i > -1; i--) {
            for(int j = mtx.length-1; j > -1 ; j--){
                mtx[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < mtx.length; i++) {
            for(int j = 0; j < mtx.length; j++){
                System.out.print(mtx[i][j]+" ");
            }
            System.out.println();
        }
    }
}
