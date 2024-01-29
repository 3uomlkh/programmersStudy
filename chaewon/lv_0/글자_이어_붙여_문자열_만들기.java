public class 글자_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(solution(my_string, index_list));
    }

    public static String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int index : index_list) answer += my_string.charAt(index);

        return answer;
    }
}
