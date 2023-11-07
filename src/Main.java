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

        // 배열에 저장된 숫자별 중복 갯수 확인
        for(int i=0; i<numArr.length; i++) {
            // numArr의 값을 counter인덱스로 잡아서 해당 인덱스의 요소값을 증감
            // 예) numArr[0] = 4; -> counter[4] 값 증감
            // comment : numArr 값을 인덱스로 잡을 생각은 전혀 못했다.
            counter[numArr[i]]++;
        }

        for(int k=0; k<counter.length; k++) {
            logger.debug(k+"의 개수 :"+counter[k]);
        }
    }
}