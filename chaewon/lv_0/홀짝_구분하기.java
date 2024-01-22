package lv_00;

import java.util.Scanner;

public class 홀짝_구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        // 삼항 연산자를 사용하는 방법
//        System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}
