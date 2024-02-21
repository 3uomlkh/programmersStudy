package lv_0;

public class 다항식_더하기 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
    }

    public static String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x"))
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }

        if(xNum == 1 && num == 0){
            answer = "x";
        }else if(xNum == 1){
            answer = "x + " + num;
        }else if(xNum != 0 && num == 0){
            answer = xNum + "x";
        }else if(xNum != 0){
            answer = xNum + "x + " + num;
        }else if(num != 0){
            answer = Integer.toString(num);
        }

        return answer;
    }
}
