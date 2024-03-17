package array.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int[][] rotateArray = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                rotateArray[i][j]=matrix[matrix.length-j-1][i];
            }
        }
        matrix=rotateArray;
        System.out.println(Arrays.deepToString(matrix));
    }
}
