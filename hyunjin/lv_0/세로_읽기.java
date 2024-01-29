public class 세로_읽기 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int strLength = my_string.length();
        int num = strLength/m;

        for (int i=0; i< num; i++) {
            answer += my_string.substring((c-1) + (m*i), (c-1) + (m*i) + 1);
        }

        return answer;
    }
}
