public class Khan {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 8, 3};
        
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        
        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Elements greater than average: " + count);
    }
}
