import java.util.Scanner;

import static java.lang.Character.*;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder(); // String 클래스와 달리 가변적이며 문자열 직접 수정 가능

        for (Character c : a.toCharArray()) { // toCharArray() : String을 char형 배열로 변경
            if (isUpperCase(c)) result.append(toLowerCase(c)); // 대문자라면 소문자로 변경
            else if(isLowerCase(c)) result.append(toUpperCase(c)); // 소문자라면 대문자로 변경
        }
        System.out.println(result);
    }
}
