public class sortArray012 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 0, 1 };
        int len = arr.length - 1;
        int temp;
        for (int i = 0; i <= len/2; i++) {
            for (int j = i+1; j <=len; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");

        }
    }
}