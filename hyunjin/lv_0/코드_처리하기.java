public class 코드_처리하기 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }

        if (answer.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }
}

/*
stream 이용하면 더 간단하게 구현 가능하다. stream 공부해보자
마지막에 "EMPTY"를 반환하게 하는 조건에 왜 mode 가 0이어야 한다는 조건이 없어야 테스트가 통과될까?
 */