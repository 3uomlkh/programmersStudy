package lv_0;

public class 문자열_여러_번_뒤집기 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));
    }

    // 잘 안 풀려서 찾아보고 이해한 문제 - 다시 풀어보기, subString()에 대해 정리해보기
    public static String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            String s1 = "";
            for (int i = e; i > s - 1; i--) {
                s1 += my_string.charAt(i);
            }
            String s2 = my_string.substring(0, s);
            String s3 = my_string.substring(e+1);

            my_string = s2 + s1 + s3;
        }

        return my_string;
    }
}
