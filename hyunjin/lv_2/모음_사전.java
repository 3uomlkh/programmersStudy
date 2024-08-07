import java.util.ArrayList;
import java.util.List;

public class 모음_사전 {
    static List<String> list;
    static String [] words = {"A", "E", "I", "O", "U"};

    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
    }
    public static int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        dfs("", 0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    static void dfs(String str, int len) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], len + 1);
        }
    }
}
