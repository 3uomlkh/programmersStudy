public class 문자열_겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int myLength = my_string.length();
        int overLength = overwrite_string.length();

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+overLength, myLength);
        return answer;
    }
}
