package lv_1;

import java.util.Arrays;

// 탐욕법(Greedy)
public class 체육복 {
    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution(5, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 전체 학생 수 - 도난당한 학생 수 = 무조건 체육복이 있는 학생 수

        //두 배열 모두 오름차순 정렬하기 -> 정렬이 되어 있지 않다면? 빌려줄 수 있어도 빌려주지 못할 수 있음.
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) { // 도난당한 학생과 여벌 체육복이 있는 학생이 같으면 -> 어차피 자기 자신에게 또 한벌이 있음.
                    answer++;
                    // 같은 학생이므로 lost[i]와 reserve[i] 모두 -1로 만들어 다시 계산하지않도록 함.
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) { // 도난당한 학생의 번호가 여벌 체육복이 있는 학생의 번호 + 1 혹은 - 1과 같을 때
                    answer++;
                    reserve[j] = -1; // 이미 빌려준 학생 체크
                    break;
                }
            }
        }

        return answer;
    }
}
