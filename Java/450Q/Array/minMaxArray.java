public class minMaxArray {
    public static void main(String[] args) {
        int []arr = { 1, 23, 33, 44, 52, 31, 46 };
        int min = arr[0];
        int max = arr[0];
        int len = arr.length - 1;

        for (int i = 0; i <= len; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}