public class 간단한_식_계산하기 {public int solution(String binomial) {
    int answer = 0;

    String[] bi= binomial.split(" ");

    int a = Integer.parseInt(bi[0]);
    int b = Integer.parseInt(bi[2]);
    String op = bi[1];

    switch (op) {
        case "+":
            answer = a + b;
            break;
        case "-":
            answer = a - b;
            break;
        case "*":
            answer = a * b;
            break;
        default:
            break;
    }

    return answer;
}
}
