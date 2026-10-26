import java.util.Scanner;
public class Okay {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 7, 1, 2, 8};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to search: ");
        int target = sc.nextInt();
        
        boolean found = false;
        
        System.out.print("Found at indices: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }
        

        if (!found) {
            System.out.println("\nNumber " + target + " not found in array.");
        }
        
        sc.close();
    }
}
    

