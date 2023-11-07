import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        int[] numArr = new int[10];
        int[] counter = new int[10];

        // 임의의 정수 0~9 배열 요소 초기화
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
        }

        // 저장된 배열 확인
        logger.debug(Arrays.toString(numArr));

        // 배열에 저장된 각 숫자 중복 수 확인
        // 0~9까지 반복하면서 숫자 카운트
        for(int i=0; i<10; i++) {
            for (int j : numArr) {
                // 배열 요소 전체 돌면서 i 정수 몇개인지 확인
                if (i == j) {
                    counter[i]++;
                }
            }

            logger.debug(i + "의 개수 :"+counter[i]);
        }
    }
}