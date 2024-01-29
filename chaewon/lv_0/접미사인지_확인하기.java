public class 접미사인지_확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }

    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffix = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            suffix[i] = my_string.substring(i);
        }

        for (String s : suffix) {
            if (s.equals(is_suffix)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    /*
    특정 문자로 시작하거나 끝나는지 확인하는 메서드가 있다. 여기서는 endsWith()를 사용하면 쉽게 풀 수 있었음!
    - startsWith() : 대상 문자열이 특정 문자 혹은 문자로 시작하는지 체크
    - endsWith() : 대상 문자열이 특정 문자 혹은 문자로 끝나는지 체크
     */
}
