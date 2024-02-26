public class 영어가_싫어요 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }

    public static long solution(String numbers) {
        long answer = 0;
        String[] num_list = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str_list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            numbers = numbers.replace(str_list[i], num_list[i]);
        }

        answer = Long.parseLong(numbers);

        return answer;
    }
}
