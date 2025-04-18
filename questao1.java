public class questao1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0);
    }

    public static void printArray(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
}
