package _2_sort;

public class _1_Bubble_Sort {
    /**
     * 时间复杂度是O(n2)
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array){
        if (array == null || array.length == 0) return array;
        for (int i = 0; i < array.length - 1; i++) {//或者i < array.length
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]){
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    /**
     * 可以进行优化，在开始位置添加一个标志位，这样如果开始就有序，只需要遍历一遍，所以时间复杂度O（n）
     * @param array
     * @return
     */
    public static int[] bubbleSort1(int[] array){
        if (array == null || array.length == 0) return array;
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {//或者i < array.length
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]){
                    flag = true;
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
            if (flag) break;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[] {9,5,2,4,6,1,8,3,7,10};
        bubbleSort(a);
        for (int m : a) {
            System.out.print(m + ",");
        }
    }
}
