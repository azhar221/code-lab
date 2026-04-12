public class NShiftArray {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 55, 66, -22, -13, 3, 5, -8 };
        int j = 0, i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}