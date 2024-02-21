public class 문자열_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }
    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");

        answer = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i += 2) {
            if (str[i].equals("+")) {
                answer += Integer.parseInt(str[i+1]);
            } else if (str[i].equals("-")) {
                answer -= Integer.parseInt(str[i+1]);
            }
        }

        return answer;
    }
}
