public class 소수_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        int flag = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int z=j+1;z<nums.length;z++){
                    flag=0;
                    int sum=nums[i]+nums[j]+nums[z];
                    for(int k=1;k<sum+1;k++){
                        if( sum%k == 0 )
                            flag+=1;
                    }

                    if(flag==2)
                        answer+=1;

                }
            }
        }

        return answer;
    }
}
