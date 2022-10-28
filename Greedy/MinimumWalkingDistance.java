import java.util.*;

public class MinimumWalkingDistance {

    static Scanner input = new Scanner(System.in);

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int size1 = mid - low + 1;
        int size2 = high - mid;

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        for (int iter1 = 0; iter1 < size1; iter1++) {
            array1[iter1] = array[iter1 + low];
        }

        for (int iter2 = 0; iter2 < size2; iter2++) {
            array2[iter2] = array[iter2 + mid + 1];
        }

        int iter1 = 0, iter2 = 0, mergeIter = low;

        // while (iter1 < size1 || iter2 < size2) {
        //     int curr = Integer.max(iter1 < size1 ? array1[iter1++] : Integer.MIN_VALUE,
        //             iter2 < size2 ? array2[iter2++] : Integer.MIN_VALUE);

        //     array[mergeIter++] = curr;
        // }

        while (iter1 < size1 && iter2 < size2) {
            if (array1[iter1] > array2[iter2])
                array[mergeIter++] = array1[iter1++];
            else
                array[mergeIter++] = array2[iter2++];
        }

        while (iter1 < size1)
            array[mergeIter++] = array1[iter1++];

        while (iter2 < size2)
            array[mergeIter++] = array2[iter2++];

    }

    public static void printArray(int[] array, int low, int high) {
        for (int i = low; i <= high; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            sort(array, low, mid);
            sort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    public static int power(int base, int exp) {
        if (exp > 0) {
            return base * power(base, exp - 1);
        }
        return 1;
    }

    public static int calculateMiles(int[] calories, int index) {
        if (index < calories.length) {
            return power(2, index) * calories[index] + calculateMiles(calories, index + 1);
        }
        return 0;
    }

    public static void main(String[] a) {
        System.out.println("Enter number of cupcakes");
        int size = input.nextInt();
        int[] calories = new int[size];
        System.out.println("Enter calories of each cupcake");
        inputArray(calories);
        sort(calories, 0, calories.length - 1);
        printArray(calories, 0, calories.length - 1);
        System.out.println(calculateMiles(calories, 0));
    }

}