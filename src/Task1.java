public class Task1 {
    public static int findMinimum(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        int minInRest = findMinimum(arr, n - 1);

        return Math.min(minInRest, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};
        int n = array.length;
        int min = findMinimum(array, n);
        System.out.println("Minimum element in the array is: " + min);
    }
}