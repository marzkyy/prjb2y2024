/**
 *  * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * Task: the swap method can change the original values of a and b.
 * 
 * Using Array to achieve the task:
 * Initialization of Array: The array originals is initialized with the values {1, 2}.
 * Calling Swap Method: The swap method is called with originals as an argument.
 * Printing Results: After the swap method executes, the values of the array are printed, showing that the values have been swapped.
 * Swap Method:
 * - A temporary variable temp is used to hold the value of the first element.
 * - The first element is then set to the value of the second element.
 * - Finally, the second element is set to the value of temp, completing the swap.
 */

public class Swap {
    public static void main(String[] args) {
        int[] originals = {1, 2};
        swap(originals);
        System.out.println(originals[0]); // 2
        System.out.println(originals[1]); // 1
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
