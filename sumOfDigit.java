package BTArray;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(473));
    }
    public static int sumOfDigit(int a){
        int sum = 0;
        while (a>0){
            sum = sum + a%10;
            a/=10;
        }
        return sum;
    }
}
