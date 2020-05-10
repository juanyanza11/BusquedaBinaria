import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 8;
        int[] nums = IntStream.generate(()
                -> ThreadLocalRandom.current().nextInt(20)).limit(30).toArray();
        System.out.println(Arrays.toString(nums));
        System.out.printf("El número %d se encuentra en la posición %d\n",
                num, busquedaBinaria(nums, num));

    }

    public static int busquedaBinaria(int[] matrix, int num) {
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == num) {
                index = i;
                break;
            }
        }

        return index;
    }
    }
