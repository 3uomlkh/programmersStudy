public class 부분_문자열_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            my_strings[i] = my_strings[i].substring(s, e+1);
        }

        for (String my_string : my_strings) {
            answer += my_string;
        }

        return answer;
    }
}
