public class 문자열_섞기 {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }

    /* 문자+문자 는 숫자연산(아스키코드), 앞에다 ""를 넣어서 실행하면 "" + charAt() => 문자열 + str2.charAt() => 문자열
    answer += str1.charAt(i) + str2.charAt(i); -> 숫자로 출력된다.
    answer += "" + str1.charAt(i) + str2.charAt(i); -> 문자로 정상 출력된다.
     */
}
