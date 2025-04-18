public class questao3 {
    public static void main(String[] args) {
        int[] array = {20, 30, 90, 11, 54};
        System.out.println("Menor valor: " + minimoRecursive(array, array.length));
    }

    public static int minimoRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], minimoRecursive(arr, n - 1));
    }
}

