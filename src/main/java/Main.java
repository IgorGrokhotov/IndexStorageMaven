import java.util.Arrays;

public class Main {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            int sgn = (i % 2 == 0) ? 1 : -1;
            arr[i] = sgn * i;
        }
        System.out.println("Original array: " + Arrays.toString(arr));

        ArrayIndexStorage arrIdx = new ArrayIndexStorage(arr);

        System.out.println("New array: " + Arrays.toString(arrIdx.getArr()));
        System.out.println("New array size: " + arrIdx.size());
        System.out.println("The value in the cell number 4: " + arrIdx.get(4 - 1));

        arrIdx.setArr(arrIdx.reverse());
        System.out.println("Reversed new array: " + Arrays.toString(arrIdx.getArr()));
        System.out.println("The value in the cell number 4: " + arrIdx.get(4 - 1));
        System.out.println("Original array: " + Arrays.toString(arr));
    }
}
