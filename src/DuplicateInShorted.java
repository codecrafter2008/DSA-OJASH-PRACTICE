public class DuplicateInShorted {

    public static void kishu(int[] arr) {

        System.out.print(arr[0] + " ");//printed 1st ele bcz the first one is ixed and in loop it doesnt count

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) { // because if we compare with arr(i+1) then we cant print last element that why we are comparing with arr(i-1)
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4};

        kishu(arr);// method calling
    }
}
