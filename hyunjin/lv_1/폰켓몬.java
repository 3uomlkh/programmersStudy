import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> type = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            type.add(nums[i]);
        }

        if(type.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = type.size();
        }

        return answer;
    }
}
