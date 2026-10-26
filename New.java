public class New {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 1, 8, 3};
        
        int largest = arr[0], smallest = arr[0];
        int largestIndex = 0, smallestIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        
        
        int secondMin = Integer.MAX_VALUE;
        int secondMinIndex = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest && arr[i] < secondMin) {
                secondMin = arr[i];
                secondMinIndex = i;
            }
        }

        if (secondMinIndex == -1) {
            System.out.println("No second minimum - all elements equal");
            secondMin = smallest;
            secondMinIndex = smallestIndex;
        }

       
        System.out.println("Largest element: " + largest + " at index " + largestIndex);
        System.out.println("Smallest element: " + smallest + " at index " + smallestIndex);
        System.out.println("Second Minimum: " + secondMin + " at index " + secondMinIndex);
    }
}
