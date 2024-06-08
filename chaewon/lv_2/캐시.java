package lv_2;

import java.util.LinkedList;
import java.util.List;

public class 캐시 {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize, cities));
    }

    /* LRU(Least Recently Used) 알고리즘
     * Cache Hit : CPU가 참조하고자 하는 메모리가 캐시에 존재하는 경우
     *             존재하는 경우, 존재하는 요소 A를 제거 후 A를 맨 앞에 추가
     * Cache Miss : CPU가 참조하고자 하는 메모리가 캐시에 존재하지 않는 경우
     *              존재하지 않고 캐시가 다 찼을 경우, 가장 오래된 요소를 제거 후 새로운 요소 삽입
     */

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        final int HIT = 1;
        final int MISS = 5;

        // 캐시 사이즈가 0일 경우 배열의 크기 * 5 만큼 반환
        if (cacheSize == 0) return cities.length * MISS;

        List<String> caches = new LinkedList<>();
        for (String city : cities) {
            // 도시 이름이 대소문자를 구분하지 않으므로 모두 소문자로 변경
            String c = city.toLowerCase();

            // 캐시에 해당 도시가 없는 경우(cache miss)
            if (!caches.contains(c)) {
                answer += MISS;
                // 캐시가 꽉 찬 경우, 가장 오랫동안 사용하지 않은 요소(가장 앞에 있는 요소) 제거
                if (caches.size() >= cacheSize) caches.remove(0); // 캐시 사이즈가 0일 경우를 처리하지 않으면 여기서 에러 발생
                caches.add(c);
                continue;
            }

            // 캐시에 해당 도시가 있는 경우(cache hit)
            caches.remove(c); // 해당 도시를 제거
            caches.add(c); // 해당 도시를 맨 뒤로 보내 최신으로 유지
            answer += HIT;
        }

        return answer;
    }
}
