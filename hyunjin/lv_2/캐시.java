import java.util.ArrayList;

public class 캐시 {
    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> cache = new ArrayList<String>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer++;
            } else {
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
                cache.add(city);
                answer += 5;
            }
        }

        return answer;
    }
}
