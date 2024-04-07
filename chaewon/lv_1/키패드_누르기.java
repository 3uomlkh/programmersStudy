package lv_1;

public class 키패드_누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        // * 키패드 : 10, 0 키패드 : 11, # 키패드 : 12로 정한 후 계산
        int left = 10;
        int right = 12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append('L');
                left = num; // 왼쪽 손의 위치 저장
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append('R');
                right = num; // 오른쪽 손의 위치 저장
            } else { // 2, 5, 8, 0일 때
                if (num == 0) num = 11;

                // 키패드 상하 차이 3, 좌우 차이 1을 이용한 거리 계산식
                int leftDist = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                int rightDist = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;

                // 거리가 더 가까운 손을 움직이기
                if (leftDist > rightDist) {
                    answer.append('R');
                    right = num;
                } else if (leftDist < rightDist) {
                    answer.append('L');
                    left = num;
                } else { // 거리가 같을 경우 hand의 값에 따라 움직임
                    if (hand.equals("right")) {
                        answer.append('R');
                        right = num;
                    } else {
                        answer.append('L');
                        left = num;
                    }
                }
            }
        }

        return answer.toString();
    }
}
