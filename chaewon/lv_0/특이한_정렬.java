package lv_0;

public class 특이한_정렬 {
    public static void main(String[] args) {
        System.out.println();
    }

    // 정렬 너무 헷갈린다. 다시 풀어보기!
    public int[] solution(int[] numList, int n) {
        int temp;

        for (int i = 0; i < numList.length - 1; i++) {
            for (int j = 0; j < numList.length - 1; j++) {
                int dist1 = Math.abs(numList[j] - n);
                int dist2 = Math.abs(numList[j + 1] - n);

                if (dist1 > dist2) {
                    temp = numList[j];
                    numList[j] = numList[j + 1];
                    numList[j + 1] = temp;
                }

                if (dist1 == dist2 && numList[j] < numList[j + 1]) {
                    temp = numList[j];
                    numList[j] = numList[j + 1];
                    numList[j + 1] = temp;
                }
            }
            // System.out.println(Arrays.toString(numList));
        }

        return numList;
    }
}
