public class 문자열_여러_번_뒤집기 {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            String substring = sb.substring(start, end + 1);
            String reversed = new StringBuilder(substring).reverse().toString();
            sb.replace(start, end + 1, reversed);
        }

        return sb.toString();
    }
}
