import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i<s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i);
                map2.put(s.charAt(i), -1);

                answer[i] = -1;
            }
            else {
                map2.put(s.charAt(i), i - map1.get(s.charAt(i)));
                map1.put(s.charAt(i), i);
                answer[i] = map2.get(s.charAt(i));
            }
        }
        return answer;
    }
}
