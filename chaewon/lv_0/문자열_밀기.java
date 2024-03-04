package lv_0;

public class 문자열_밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello","ohell"));
        System.out.println(solution("apple","elppa"));
        System.out.println(solution("abc","abc"));
    }

    public static int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);

        for (int i = 0; i < A.length(); i++) {
            if (sb.toString().equals(B)) break;
            char end = sb.toString().charAt(A.length() - 1);
            sb.insert(0, end); // 맨 끝에 있는 문자를 앞에 붙임
            sb.deleteCharAt(sb.toString().length() - 1); // 맨 끝에 있는 문자를 삭제
            answer++;
        }

        // 한 줄로 푸는 방법이 있었다..!
//        return (B+B).indexOf(A);

        return answer == A.length() ? -1 : answer;
    }
}
