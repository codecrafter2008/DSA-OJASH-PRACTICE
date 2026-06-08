public class linearsearch {

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 2, 3};

        int target = 6;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element Found at Index: " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}