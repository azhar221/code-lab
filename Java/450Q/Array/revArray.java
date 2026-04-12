public class revArray {
    public static void main(String[] args) {
        int arr[] = { 22, 34, 55, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 111 };
        int j = arr.length - 1;

        if (j != -1) {

            System.out.println("Array Before");

            for (int e : arr) {
                System.out.print(e + " ");
            }

            System.out.println();

            for (int i = 0; i < j; i++) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                } else {
                    return;
                }
            }
            System.out.println("Array After");

            for (int e : arr) {
                System.out.print(e + " ");
            }
        } else {
            System.out.println("enter valid array");

        }
    }
}
