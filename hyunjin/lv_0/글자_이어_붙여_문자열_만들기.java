public class 글자_이어_붙여_문자열_만들기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] arr = my_string.split("");

        for (int j = 0; j < index_list.length; j++) {
            answer += arr[index_list[j]];
        }
        return answer;
    }
}
