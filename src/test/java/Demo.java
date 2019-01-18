import org.junit.Test;

import java.util.Date;

public class Demo {

    @Test
    public void test () {
        int[] arr = DataUtil.genData(10000);
        long start = new Date().getTime();
        insert(arr.clone());
        long end = new Date().getTime();
        System.out.println(end - start);
        start = new Date().getTime();
        bubble(arr.clone());
        end = new Date().getTime();
        System.out.println(end - start);
        start = new Date().getTime();
        select(arr.clone());
        end = new Date().getTime();
        System.out.println(end - start);
    }

    /** 冒泡排序 */
    private void bubble(int[] arr) {
        int size = arr.length, tmp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /** 选择排序 */
    private void select(int[] arr) {
        int min, tmp;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    /** 插入排序 */
    private void insert(int[] arr) {
        int size = arr.length;
        int before, current;
        for (int i = 1; i < size; i++) {
            before = i - 1;
            current = arr[i];
            while (before >=0 && arr[before] > current) {
                arr[before + 1] = arr[before];
                before--;
            }
            arr[before + 1] = current;
        }
    }

}
