package lv_0;

public class 부분_문자열인지_확인하기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "wxyz"));
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
