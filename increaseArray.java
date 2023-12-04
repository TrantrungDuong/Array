package BTArray;

public class increaseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 5, 6};
        if (isIncreasingArray(arr2)){
            System.out.println("an increasing array");
        }else {
            System.out.println("just an array");
        }
    }


    public static boolean isIncreasingArray(int[] arr){
        for (int i =1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
