public class 배열_비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = arr1.length;
        int num2 = arr2.length;
        int hap1 = 0;
        int hap2 = 0;

        if (num1 > num2) {
            answer = 1;
        } else if (num1 < num2) {
            answer = -1;
        } else if (num1 == num2) {

            for (int i = 0; i < num1; i++) {
                hap1 += arr1[i];
                hap2 += arr2[i];
            }
            if (hap1 == hap2) {
                answer = 0;
            } else if (hap1 > hap2) {
                answer = 1;
            } else {
                answer = -1;
            }

        }

        return answer;
    }
}
