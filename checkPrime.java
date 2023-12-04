package BTArray;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
    public static boolean isPrime(int a){
        for (int i = 2; i <= Math.sqrt(a) ; i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
}
