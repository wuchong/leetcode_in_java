/**
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up:
 * Could you do this in-place?
 *
 * answer: 细节实现题，从外圈到内圈，每次四个数交换
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = n-1;
        for(int j=0;j<(n>>1);j++){
            for(int i=j;i<m-j;i++){
            	int temp = matrix[i][j];
            	matrix[i][j] = matrix[m-j][i];
            	matrix[m-j][i] = matrix[m-i][m-j];
            	matrix[m-i][m-j] = matrix[j][m-i];
            	matrix[j][m-i] = temp;
            }
        }
    }
}
