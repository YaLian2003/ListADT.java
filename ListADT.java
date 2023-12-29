public class ListADT {

    // Method to find the maximum value in an array recursively
    public static int recursiveMax(int[] array, int first, int last) {
        if (first == last) {
            return array[first];
        } else {
            int mid = (first + last) / 2;
            int max1 = recursiveMax(array, first, mid);
            int max2 = recursiveMax(array, mid + 1, last);
            return Math.max(max1, max2);
        }
    }
}
