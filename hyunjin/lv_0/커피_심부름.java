public class 커피_심부름 {
    public int solution(String[] order) {
        int answer = 0;

        for (String str : order) {
            if (str.contains("cafelatte")) {
                answer+=5000;
            } else {
                answer+=4500;
            }
        }

        return answer;
    }
}
