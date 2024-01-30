package lv_0;

public class 문자열_바꿔서_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace('A', 'C');
        myString = myString.replace('B', 'A');
        myString = myString.replace('C', 'B');

        if (myString.contains(pat)) return 1;

        return answer;
    }
}
