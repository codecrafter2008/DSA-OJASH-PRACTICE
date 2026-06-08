public class LargestElement {

    // Method to find largest element

    public static int findLargest(int[] arr) {

        int largest = arr[0];  // Assume first element is largest

        for (int i = 1; i < arr.length; i++) { // Traverse the array from second element

            if (arr[i] > largest) {            // If current element is greater than largest
                largest = arr[i];
            }
        }

        // Return the largest value
        return largest;
    }

    public static void main(String[] args) {


        int[] nums = {4, 5, 6, 2, 3};// Array declaration


        int result = findLargest(nums);// Method calling


        System.out.println("Largest Element = " + result); // Print result
    }
}