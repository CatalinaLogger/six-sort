import java.util.Random;

public class DataUtil {

    public static int[] genData(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            arr[i] = random.nextInt(size);
            i++;
        }
        return arr;
    }
}
