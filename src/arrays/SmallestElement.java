package arrays;

public class SmallestElement {

    public static int findSmallest(int[] arr) {

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7};

        int result = findSmallest(nums);

        System.out.println("Smallest Element = " + result);
    }
}