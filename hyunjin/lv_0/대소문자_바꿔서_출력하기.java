import java.util.Scanner;

import static java.lang.Character.*;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (isUpperCase(b)) {
                result += toLowerCase(b);
            } else {
                result += toUpperCase(b);
            }
        }

        System.out.print(result);
    }
}
