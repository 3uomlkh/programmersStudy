import java.util.Arrays;

public class _1차_다트_게임 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));

        System.out.println(solution("10S0D4D*"));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int count = 0;
        int tenCh = 0;
        int[] arr = new int[3];

        String[] dart = dartResult.split("");


        for (int i = 0; i < dart.length; i++) {

            switch(dart[i]) {
                case "S":
                    count++;
                    tenCh = 0;
                    break;
                case "D":
                    arr[count] = (int) Math.pow(arr[count], 2);
                    count++;
                    tenCh = 0;
                    break;
                case "T":
                    arr[count] = (int) Math.pow(arr[count], 3);
                    count++;
                    tenCh = 0;
                    break;
                case "*":
                    if (count >= 2) {
                        arr[count-2] *= 2;
                        arr[count-1] *= 2;
                    } else {
                        arr[count-1] *= 2;
                    }
                    break;
                case "#":
                    arr[count-1] *= -1;
                    break;
                default:
                    if (tenCh == 0) {
                        arr[count] = Integer.parseInt(dart[i]);
                        tenCh++;
                    } else {
                        arr[count] = 10;
                        tenCh++;
                    }
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
