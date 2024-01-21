public class 두_수의_연산값_비교하기 {
    public int solution(int a, int b) {
        int answer = 0;
        String strAB = "" + a + b;
        int mul2AB = 2 * a * b;

        answer = Math.max(Integer.valueOf(strAB), mul2AB);
        return answer;
    }
}

/*
int형 앞에 "" 붙여주면 문자열로 인식한다.
 */
