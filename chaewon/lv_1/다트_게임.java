package lv_1;

import java.util.*;

public class 다트_게임 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1T2D3D#"));
    }

    // 답을 보고 푼 문제
    public static int solution(String dartResult) {
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('S', 1);
        map.put('D', 2);
        map.put('T', 3);

        String num = "";
        List<Integer> score = new ArrayList<>();
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            if (Character.isDigit(ch)) { // 문자가 숫자라면
                num += dartResult.charAt(i);
            } else if (ch == 'S' || ch == 'D' || ch == 'T') { // S, D, T중 하나라면
                int number = Integer.parseInt(num);
                score.add((int) Math.pow(number, map.get(ch))); // 문자에 해당하는 value 값에 따라 계산 후 리스트에 넣기
                num = "";
            } else { // 옵션
                if (ch == '*') { // 스타상 - 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만듦
                    if (score.size() == 1) { // 첫 번째 기회에 나올 경우
                        score.set(score.size() - 1, score.get(score.size() - 1) * 2);
                    } else {
                        score.set(score.size() - 1, score.get(score.size() - 1) * 2);
                        score.set(score.size() - 2, score.get(score.size() - 2) * 2);
                    }
                } else if (ch == '#') { // 아차상 - 해당 점수 마이너스
                    score.set(score.size() - 1, score.get(score.size() - 1) * -1);
                }
            }

        }

        for (Integer i : score) {
            answer += i;
        }

        return answer;
    }
}
