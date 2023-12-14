import java.util.Arrays;

public class mergeQuickSort {
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {return array;}

        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array,midIndex,array.length));

        return merge(left, right);

    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] combinedArray = new int [array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                combinedArray[index] = array1[i];
                index ++;
                i++;
            } else {
                combinedArray[index] = array2[j];
                index++;
                j++;
            }
        }
        while(i < array1.length){
            combinedArray[index] = array1[i];
            index++;
            i++;
        }
        while(j < array2.length){
            combinedArray[index] = array2[j];
            index++;
            j++;
        }
        return combinedArray;
    }

    public static void main(String[] arge) {
        int[] array = {4,3,5,6,5,4,3,4,6,8,8,9,5,3,4555,313,5325};
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    
}
