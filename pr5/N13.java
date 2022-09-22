package pr5;

import java.util.Scanner;

public class N13 {
    public static void f13() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) return;
        System.out.println(a);
        a = sc.nextInt();
        if (a == 0) return;
        f13();
    }

    public static void f14(int a) {
        if (a/10 != 0)
            f14(a/10);
        System.out.print(a%10 + " ");
    }

    public static void f15(int a) {
        System.out.print(a%10 + " ");
        if (a/10 != 0) {
            f15(a/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f15(sc.nextInt());
    }
}
