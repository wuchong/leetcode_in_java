/**
 * Given an array and a value, remove all instances 
 * of that value in place and return the new length.
 * 
 * The order of elements can be changed. It doesn't 
 * matter what you leave beyond the new length.
 * 
 * answer: 将非删除元素覆盖到前面
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
         int index = 0;
         for(int i=0;i<A.length;i++){
        	 if(A[i] != elem){
        		 A[index++] = A[i];
        	 }
         }
         return index;
    }

}
