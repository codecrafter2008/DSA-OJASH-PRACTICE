public class SecondLargest {

    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int findSecondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {

                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 120, 230, 210};

        int largest = findLargest(array);

        int secondLargest = findSecondLargest(array);

        System.out.println("Largest Element = " + largest);
        System.out.println("Second Largest Element = " + secondLargest);
    }
}
