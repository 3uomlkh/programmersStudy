public class 외계어_사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 0;

        for(int i = 0 ; i< dic.length ; i++)
        {
            int cnt  = 0 ;
            for(int j = 0 ; j < spell.length ; j++)
            {
                if(dic[i].indexOf(spell[j]) == -1)
                {
                    cnt = 1;
                    answer = 2;
                    break;
                }
            }

            if(cnt == 0)
            {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
