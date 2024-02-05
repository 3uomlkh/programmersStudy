public class 배열의_길이에_따라_다른_연산하기 {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr.clone();

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i+=2){
                answer[i] += n;
            }
        } else {
            for (int j = 1; j < arr.length; j+=2){
                answer[j] += n;
            }
        }
        return answer;
    }
}
