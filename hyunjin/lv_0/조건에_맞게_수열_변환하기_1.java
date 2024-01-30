public class 조건에_맞게_수열_변환하기_1 {
    public int[] solution(int[] arr) {
        int[] answer = (int[])arr.clone();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i]/2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i]*2;
            }
        }
        return answer;
    }
}
