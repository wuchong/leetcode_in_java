/**
 * Given an array with n objects colored red, white or blue, 
 * sort them so that objects of the same color are adjacent, 
 * with the colors in the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, 
 * white, and blue respectively.
 * 
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 *
 * answer: 两个指针往中间走，交换
 */
public class SortColors {
	public void sortColors(int[] A) {
		int red = 0;
		int blue = A.length - 1;
		for (int i = 0; i <= blue;) {
			if (A[i] == 0) {
				swap(A, i++, red++);
			} else if (A[i] == 2) {
				swap(A, i, blue--);
			} else {
				i++;
			}
		}
	}

	private void swap(int A[], int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
