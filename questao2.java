public class questao2 {
    public static void main(String[] args) {
        char[] str = {'B', 'r', 'a', 's', 'i', 'l'};
        stringInverse(str, str.length - 1);
    }

    public static void stringInverse(char[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index]);
        stringInverse(arr, index - 1);
    }
}

