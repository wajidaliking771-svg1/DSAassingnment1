import java.util.Scanner;
import java.util.Arrays;
public class Index {
public static void main(String[] args) {
        int[] arr = new int[10]; 
        arr[0] = 5; arr[1] = 2; arr[2] = 9; arr[3] = 7; arr[4] = 3;
        int n = 5; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Current array: " + Arrays.toString(Arrays.copyOf(arr, n)));
        
        
        System.out.print("Enter index to insert (0 to " + n + "): ");
        int index = sc.nextInt();
        System.out.print("Enter number to insert: ");
        int num = sc.nextInt();
        
        if (index < 0 || index > n) {
            System.out.println("Invalid index!");
        } else {
            
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            
            
            arr[index] = num;
            n++;
            
            System.out.println("Updated array: " + Arrays.toString(Arrays.copyOf(arr, n)));
        }
        sc.close();
    }
}
