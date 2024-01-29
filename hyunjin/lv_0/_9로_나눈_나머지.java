public class _9로_나눈_나머지 {
    public int solution(String number) {
        int answer = 0;
        String arr[] = number.split("");
        int hap = 0;

        for (int i = 0; i < arr.length; i++) {
            hap += Integer.valueOf(arr[i]);
        }
        answer = hap % 9;
        return answer;
    }
}
