public class 문자_리스트를_문자열로_변환하기 {
    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++)  {
            answer += arr[i];
        }

        return answer;
    }
}

/*
String.join("", arr) 이용하면 깔끔하게 한줄로 해결 가능
 */
