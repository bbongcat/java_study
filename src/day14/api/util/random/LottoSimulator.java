package day14.api.util.random;

import java.util.*;

public class LottoSimulator {

    /*
    로또 번호 여섯개를 랜덤 넘버로 생성해서 고정해놓고
    보너스 번호 추가로 생성
    숫자들이 중복되지 않도록

    로또 구매 횟수
    로또 구매 금액과 당첨금을 비교하여 이득 계산
     */

    public static double firstRate;
    public static double secondRate;
    public static double thirdRate;
    public static double fourthRate;
    public static double fifthRate;
    public static double loseRate;
    public static int firstCount;
    public static int secondCount;
    public static int thirdCount;
    public static int fourthCount;
    public static int fifthCount;
    public static int loseCount;
    public static int[] lottoNum = new int[6];
    public static int[] lottoPaper = new int[6];
    public static int bonus;
    public static int count;

    // 로또 배열과 숫자를 입력하면 숫자가 배열과 중복일 경우 해당 배열의 인덱스를,
    // 중복이 아닐 경우 -1을 반환하는 메서드
    public static int searchNumIndex(int[] arr, int key) {

        for (int i = 0; i < 6; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // 배열에서 key 값을 찾을 수 없음
    }

    // 로또 당첨 번호 배열 생성
    public static void createLotto() {

        while (true) {

            int rn = (int) (Math.random() * 45) + 1;

            if (!(searchNumIndex(lottoNum, rn) == -1)) { // rn이 중복일 경우
                continue;
            } else { // 중복이 아닐 경우
                if (searchNumIndex(lottoNum, 0) == -1) { // 배열에 빈자리가 없을 경우
                    Arrays.sort(lottoNum); // 배열 오름차순 정렬
                    break;
                } else { // 배열에 빈자리가 있을 경우
                    lottoNum[searchNumIndex(lottoNum, 0)] = rn;
                }
            }
        }
    }

    // 보너스 번호 생성
    public static void createBonus() {

        while (true) {

            bonus = (int) (Math.random() * 45) + 1;

            if (!(searchNumIndex(lottoNum, bonus) == -1)) { // 숫자가 중복일 경우
                bonus = (int) (Math.random() * 45) + 1;
                continue;
            } else { // 중복이 아닐 경우
                break;
            }
        }
    }

    // 로또 배열 생성
    public static void lottoPaper() {

        System.out.printf("로또 %d장째 구입중. . .", count);

        while (true) {

            int rn = (int) (Math.random() * 45) + 1;

            if (!(searchNumIndex(lottoPaper, rn) == -1)) { // rn이 중복일 경우
                continue;
            } else { // 중복이 아닐 경우
                if (searchNumIndex(lottoPaper, 0) == -1) { // 배열에 빈자리가 없을 경우
                    Arrays.sort(lottoPaper); // 배열 오름차순 정렬
                    break;
                } else { // 배열에 빈자리가 있을 경우, rn을 배열에 추가
                    lottoPaper[searchNumIndex(lottoPaper, 0)] = rn;
                }
            }
        }
        System.out.println(Arrays.toString(lottoPaper));
        lottoWin();
    }

    // 로또 당첨 등수 판단
    public static void lottoWin() {

        int correctNumCount = 0;
        for (int k : lottoNum) {
            for (int j = 0; j < lottoNum.length; j++) {
                if (k == lottoPaper[j]) {
                    correctNumCount++;
                }
            }
        }

        if (correctNumCount == 6) { // 1등
            firstCount++;
        } else if (correctNumCount == 5) {
            for (int x = 0; x < 6; x++) {
                if (bonus == lottoPaper[x]) { // 2등
                    secondCount++;
                    break;
                }
            }
            thirdCount++; // 3등
            Arrays.fill(lottoPaper, 0);
        } else if (correctNumCount == 4) { // 4등
            fourthCount++;
            Arrays.fill(lottoPaper, 0);
        } else if (correctNumCount == 3) { // 5등
            fifthCount++;
            Arrays.fill(lottoPaper, 0);
        } else { // 꽝
            loseCount++;
            Arrays.fill(lottoPaper, 0);

        }
        count++;
    }

    public static void main(String[] args) {

        createLotto();
        System.out.println("# 로또 추첨 번호: " + Arrays.toString(lottoNum));
        createBonus();
        System.out.println("# 보너스 번호: " + bonus);
        while (true) {
            lottoPaper();
            if (firstCount == 1) {
                firstRate = (firstCount / (double) count) * 100;
                secondRate = (secondCount / (double) count) * 100;
                thirdRate = (thirdCount / (double) count) * 100;
                fourthRate = (fourthCount / (double) count) * 100;
                fifthRate = (fifthCount / (double) count) * 100;
                loseRate = (loseCount / (double) count) * 100;
                long lottoPrizeMoney = (firstCount * 2000000000L) + (secondCount * 60000000L)
                        + (thirdCount * 1500000L) + (fourthCount * 50000L) + (fifthCount * 5000L);
                long lottoPurchaseMoney = count * 1000L;

                System.out.printf("\n# %d번만에 1등에 당첨되었습니다.\n", count);
                System.out.println("# 1등에 당첨될 때까지 누적 당첨 현황. . .");
                System.out.printf("# 1등 당첨 횟수(%.8f%%): %d회\n", firstRate, firstCount);
                System.out.printf("# 2등 당첨 횟수(%.8f%%): %d회\n", secondRate, secondCount);
                System.out.printf("# 3등 당첨 횟수(%.8f%%): %d회\n", thirdRate, thirdCount);
                System.out.printf("# 4등 당첨 횟수(%.8f%%): %d회\n", fourthRate, fourthCount);
                System.out.printf("# 5등 당첨 횟수(%.8f%%): %d회\n", fifthRate, fifthCount);
                System.out.printf("# 꽝 횟수(%.8f%%): %d회\n\n", loseRate, loseCount);
                System.out.printf("# 총 당첨금: %d원\n", lottoPrizeMoney);
                System.out.printf("# 총 로또 구매 금액: %d원\n", lottoPurchaseMoney);
                System.out.println("# 이득 계산: " + (lottoPrizeMoney - lottoPurchaseMoney) + "원");
                break;
            }
        }
    }
}
