public class 글자_지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArray = my_string.split("");

        for (int i=0; i<indices.length; i++) {
            strArray[indices[i]] = "";
        }

        answer = String.join("", strArray);
        return answer;
    }
}
