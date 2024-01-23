import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 배열_만들기_2 {
    public static void main(String[] args) {
        System.out.println(solution(5,555));
    }

    public static ArrayList<Integer> solution(int l, int r) {
        ArrayList<String> s_list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        String pattern = "[05]+"; // 0과 5로 이루어진 문자열을 찾기 위한 정규표현식
        Pattern regex = Pattern.compile(pattern); // 정규표현식 패턴을 컴파일
        int cnt = 0;

        for (int i = l; i <= r; i++) {
            s_list.add(Integer.toString(i));
        }
        for (int i = 0; i < s_list.size(); i++) {
            Matcher matcher = regex.matcher(s_list.get(i)); // 패턴과 문자열을 매칭
            if (matcher.matches()) { // 패턴과 정확히 일치하는지 확인
                answer.add(Integer.parseInt(s_list.get(i)));
            } else {
                cnt++;
            }

            if (cnt == s_list.size()) {
                answer.add(-1);
                break;
            }
        }

        return answer;
    }
}
