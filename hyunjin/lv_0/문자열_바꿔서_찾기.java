public class 문자열_바꿔서_찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;

        String replacedStr = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');

        if (replacedStr.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
