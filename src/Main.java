public class Main {

    public static int LargestElement(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 2, 3};

        int result = LargestElement(nums);

        System.out.println(result);
    }
}