public class 한_번만_등장한_문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }

    public static String solution(String s) {
        String answer = "";
        int num = 0;
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            num = (int) s.charAt(i);
            arr[num - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char) (i + 97);
            }
        }
        return answer;
    }
}
