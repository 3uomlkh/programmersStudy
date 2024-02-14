package lv_0;

public class 모음_제거 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (my_string.contains(vowel)) { // 문자열에 vowels 배열의 원소가 포함되는지
                my_string = my_string.replace(vowel, ""); // 포함된다면 제거
            }
        }

        // 다른 풀이 - 정규표현식 이용하기
        // answer = my_string.replaceAll("[aeiou]", "");

        return my_string;
    }
}
