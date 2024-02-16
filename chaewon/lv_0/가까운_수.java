package lv_0;

public class 가까운_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        int diff;
        int min = Integer.MAX_VALUE; // int 데이터 타입의 최대값(min을 0으로 설정하면 최솟값을 담는 것이 불가능)

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) return n;
            diff = Math.abs(n - array[i]); // Math.abs() 절댓값을 구하는 함수
            if (diff < min) {
                min = diff;
                answer = array[i];
            } else if (diff == min && array[i] < answer) { // 가장 가까운 수가 여러 개일 경우, answer가 더 크다면
                answer = array[i]; // answer에 array[i] 할당
            }
        }

        return answer;
    }
}
