import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static int[] shuffle(int[] arr) {
        // 매개변수 유효성 검사
        if(arr == null || arr.length == 0) {
            return arr;
        }

        for(int i=0; i<arr.length; i++) {
            int randomNum = (int)(Math.random()*arr.length); // 0~9

            // 각 요소끼리 값 바꿔주기 = 섞기
            int tmp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        logger.debug(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        logger.debug(java.util.Arrays.toString(result));
    }
}