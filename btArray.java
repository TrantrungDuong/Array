package BTArray;

public class btArray {
    public static void main(String[] args) {

        int[] arr = {10,6,3,8,4,12,15};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max= arr[i];
            }
        }
        return max;
    }
}
