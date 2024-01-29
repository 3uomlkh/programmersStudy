public class 수_조작하기_1 {
    public int solution(int n, String control) {
        int answer = 0;

        for (String s: control.split("")) {
            if (s.equals("w")) {
                n += 1;
            } else if (s.equals("s")) {
                n -= 1;
            } else if (s.equals("d")) {
                n += 10;
            } else {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}
