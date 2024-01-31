public class 특정한_문자를_대문자로_바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";

        answer = my_string.replace(alp, alp.toUpperCase());

        return answer;
    }
}
