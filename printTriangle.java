package BTArray;


import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu cao tam giac la: ");
        int h = sc.nextInt();
        for (int i = 1; i <= h ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }
}
