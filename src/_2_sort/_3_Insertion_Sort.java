package _2_sort;

public class _3_Insertion_Sort {
    /**
     * 最少O（n），最大O（n2）
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array ==  null || array.length == 0) return array;
        int cur;
        for (int i = 0; i < array.length - 1; i++) {
            cur = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && cur < array[preIndex]){
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = cur;
        }
        return array;
    }

}
