public class BubbleShort{
    public static void bubbleshort(int []arr){
        for(int i=0;i<arr.length-1;i++){ // arr.length-1 = no of pass(5-1=4)means the loop runs 4 time to arranges the num
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j]=temp; //temp is temporary location to store arr[j]
                }
            }
        }
    }
}
public static void main(String[] args){
    int [] arr={1,3,5,6,7,8,12,13,33};
    BubbleShort.bubbleshort(arr); // method calling
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i] + "");
    }
}
//Time complexity =O(n²)