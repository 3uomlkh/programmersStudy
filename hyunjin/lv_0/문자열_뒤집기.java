public class 문자열_뒤집기 {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        for (int i=0; i<my_string.length(); i++) {
            if (i < s || i > e) {
                answer += my_string.charAt(i);
            } else if (s <= i && i <= e) {
                answer += my_string.charAt(e+s-i);
            }
        }
        return answer;
    }
}
