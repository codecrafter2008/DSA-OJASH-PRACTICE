public class LeftRotateOne{
    public static void leftrotate(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
public static void main(String[] args){
    int[] arr={1,3,4,5,6,7,8,9};
    LeftRotateOne.leftrotate(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
    }
}
