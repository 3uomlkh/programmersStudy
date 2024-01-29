public class 문자열의_뒤의_n_글자 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }

    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = my_string.length()-1; i >= 0; i--) {
            sb.append(my_string.charAt(i));
            cnt++;

            if (cnt == n) break;
        }

        sb.reverse();
        String answer = String.valueOf(sb);

        return answer;

        // 아래와 같이 한 줄로 해결할 수 있었다..ㅎ (+ 시간단축)
//        return my_string.substring(my_string.length() - n);

    }
}
