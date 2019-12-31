package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JoinArraysUsingJavaAPI {

    public static void main(String[] args) {

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        String[] result = joinArrayGeneric(s1, s2, s3);

        System.out.println(Arrays.toString(result));
    }

    static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }

        //T[] result = new T[length];
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);

        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

    static int[] joinArray(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }

        final int[] result = new int[length];

        int offset = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

    //create other overloaded primitive type - long, double...
    //static long[] joinArray(long[]... arrays)
}