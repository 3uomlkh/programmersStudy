public class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String strAB = strA + strB;
        String strBA = strB + strA;

        if (Integer.valueOf(strAB) >= Integer.valueOf(strBA)) {
            answer = Integer.valueOf(strAB);
        } else {
            answer = Integer.valueOf(strBA);
        }
        return answer;
    }
}

/*
Math.max 사용하면 if문 없이 간단하게 구현 가능하다.
answer = Math.max(Integer.valueOf(strAB), Integer.valueOf(strBA))
 */
