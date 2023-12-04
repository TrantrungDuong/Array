package BTArray;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b: ");
        int b = sc.nextInt();
        System.out.print("UCLN là: ");
        findUCLN(a,b);

    }

    public static void findUCLN(int a, int b){
        for (int i = Math.min(a,b); i >= 1 ; i--) {
            if (a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
