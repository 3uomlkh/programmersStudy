package lv_1;

import java.util.HashMap;

public class 성격_유형_검사하기 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0); map.put('T', 0);
        map.put('C', 0); map.put('F', 0);
        map.put('J', 0); map.put('M', 0);
        map.put('A', 0); map.put('N', 0);

        HashMap<Integer, Integer> score = new HashMap<>();
        score.put(1, 3); score.put(2, 2); score.put(3, 1);
        score.put(4, 0);
        score.put(5, 1); score.put(6, 2); score.put(7, 3);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 1 || choices[i] == 2 || choices[i] == 3) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + score.get(choices[i]));
            } else if (choices[i] == 5 || choices[i] == 6 || choices[i] == 7) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + score.get(choices[i]));
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        answer.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        answer.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        answer.append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return answer.toString();
    }
}
