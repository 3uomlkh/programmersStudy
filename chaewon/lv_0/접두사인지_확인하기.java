public class 접두사인지_확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "abcd"));
        System.out.println(solution("banana", "bananan"));
    }

    public static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;

        // 접미사 확인하기 문제에서 알게 된 startsWith() 메서드 : 대상 문자열이 특정 문자 혹은 문자로 시작하는지 체크
    }
}
