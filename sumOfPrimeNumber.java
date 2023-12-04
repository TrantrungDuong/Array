package BTArray;

public class sumOfPrimeNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 7;
        System.out.println(sumOfPrime(start, end));

    }
    public static boolean isPrime(int number){
        if (number<=1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrime(int start, int end){
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            if (isPrime(i)){
                sum += i;
            }
        }

        return sum;
    }
}
