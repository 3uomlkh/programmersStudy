public class 문자열_밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "abc"));
    }

    public static int solution(String A, String B) {
        int answer = 0;

        answer = (B + B).indexOf(A);

        return answer;
    }
}
