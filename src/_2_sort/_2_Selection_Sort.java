package _2_sort;

public class _2_Selection_Sort {
    /**
     * 无论怎么样时间复杂度都是O（n2）
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if (array ==  null || array.length == 0) return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[minIndex])
                    minIndex = j;
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = array[i];
        }
        return array;
    }
}
