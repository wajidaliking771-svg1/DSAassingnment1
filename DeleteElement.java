import java.util.Scanner;
import java.util.Arrays;
public class DeleteElement {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 7, 3, 8};
        int n = arr.length;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Current array: " + Arrays.toString(arr));
        
        
        System.out.print("Enter index to delete (0 to " + (n-1) + "): ");
        int index = sc.nextInt();
        
        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
        } else {
            
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            
          
            System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }
        sc.close();
    }
}
