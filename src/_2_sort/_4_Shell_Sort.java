package _2_sort;

public class _4_Shell_Sort {
    /**
     * O(nlog2 n)
     * 其思想是对整个数组进行分组排序
     * @param array
     * @return
     */
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int tmp, gap = len >> 1;
        while (gap > 0){
            for (int i = gap; i < len; i++) {
                tmp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > tmp){
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = tmp;

            }
            gap >>= 1;
        }
        return array;
    }
}
