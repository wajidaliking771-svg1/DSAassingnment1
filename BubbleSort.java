import java.util.Arrays;
public class BubbleSort {
    

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8};
        int n = arr.length;
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        
        System.out.println("Ascending order: " + Arrays.toString(arr));
        
        System.out.print("Descending order: [");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}
