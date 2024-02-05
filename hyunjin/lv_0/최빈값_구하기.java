public class 최빈값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }

    public static int solution(int[] array) {
        int answer = 0;

        int max = 0; int frequent[] = new int[1000];

        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if(max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            } else if (max == frequent[array[i]]) {
                for (int j = 0; j < array.length; j++) {
                    if (max == frequent[array[j]]) {
                        answer = -1;
                    }
                }
            }
        }

        return answer;
    }
}
