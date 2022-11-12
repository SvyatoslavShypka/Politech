package Arrays_tmp;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int n = 10;
        int[] big_array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < big_array.length; i++) {
            big_array[i] = rand.nextInt(100) + 1;
            if (big_array[i] %2 == 0) {
            }
        }

//part2
        long startTime2 = System.nanoTime();

        int j2 = 0;

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] %2 == 0) {
                j2++;
            }
        }

        int[] result_array2 = new int[j2];
        j2 = 0;

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] %2 == 0) {
                result_array2[j2++] = big_array[i];
            }
        }
//        for (int i = 0; i < big_array.length; i++) {
//            System.out.println("big_array[" + i + "] = " + big_array[i]);
//        }
        System.out.println("j2= " + j2);
//        System.arraycopy(small_array, 0, result_array, 0, j);
//        small_array = result_array;
        for (int i = 0; i < result_array2.length; i++) {
//            result_array[i] = small_array[i];
//            System.out.println("result_array[" + i + "] = " + result_array2[i]);
        }
        long elapsedTime2 = System.nanoTime() - startTime2;
        System.out.println("time2 was= " + elapsedTime2 + " ns");
//part1
        long startTime = System.nanoTime();

        int[] small_array = new int[n];
        int j = 0;

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] %2 == 0) {
                small_array[j++] = big_array[i];
            }
        }

//        for (int i = 0; i < big_array.length; i++) {
//            System.out.println("big_array[" + i + "] = " + big_array[i]);
//        }
        System.out.println("j= " + j);
//        int[] result_array = new int[j];
        small_array = Arrays.copyOf(small_array, j);
//        System.arraycopy(small_array, 0, result_array, 0, j);
//        small_array = result_array;
        for (int i = 0; i < small_array.length; i++) {
//            result_array[i] = small_array[i];
//            System.out.println("result_array[" + i + "] = " + small_array[i]);
        }

        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("time1 was= " + elapsedTime + " ns");

        System.out.println("winner " + (elapsedTime<elapsedTime2 ? 1:2));
    }
}
