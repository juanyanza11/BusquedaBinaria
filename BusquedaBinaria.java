/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 *
 * @author ADMIN-HP
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 8;
        int[] nums = IntStream.generate(()
                -> ThreadLocalRandom.current().nextInt(20)).limit(30).toArray();
        System.out.println(Arrays.toString(nums));
        System.out.printf("El número %d se encuentra en la posición %d\n", num, busquedaBinaria(nums, num));

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
