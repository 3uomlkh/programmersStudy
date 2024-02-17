package lv_0;

import java.util.Arrays;

public class 영어가_싫어요 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }

    public static long solution(String numbers) {
        long answer;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length(); i++) {
            sb.append(numbers.charAt(i));
            if (Arrays.asList(num).contains(sb.toString())) {
                switch (sb.toString()) {
                    case "zero" :
                        sb2.append('0');
                        break;
                    case "one" :
                        sb2.append('1');
                        break;
                    case "two" :
                        sb2.append('2');
                        break;
                    case "three" :
                        sb2.append('3');
                        break;
                    case "four" :
                        sb2.append('4');
                        break;
                    case "five" :
                        sb2.append('5');
                        break;
                    case "six" :
                        sb2.append('6');
                        break;
                    case "seven" :
                        sb2.append('7');
                        break;
                    case "eight" :
                        sb2.append('8');
                        break;
                    case "nine" :
                        sb2.append('9');
                        break;
                }
                sb.setLength(0);
            }
        }

        answer = Long.parseLong(sb2.toString());

        return answer;
    }
}
