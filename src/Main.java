import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static int max(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -999999;
        }

        int max = arr[0];

        // 그냥 각 요소별로 비교하면서 큰 값 넣어두면 되는거였는데 굳이 정렬을 핸네,,ㅎ
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;

        /* 내가 푼 거 :
        // 원본값 유지하기 위해 배열 복사
        int[] arrTmp = Arrays.copyOf(arr, arr.length);
        arr = arrTmp;

        // 오름차순 정렬
        for(int i=0; i<arr.length-1; i++) {
            boolean chk = false;
            for (int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    chk = true;
                }
            }
            if(!chk) break;
        }

        // 정렬 후 마지막 요소값이 최대값이므로 해당 값 리턴
        return arr[arr.length-1];
        */
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        logger.debug(java.util.Arrays.toString(data));
        logger.debug("최대값:"+max(data));
        logger.debug("최대값:"+max(null));
        logger.debug("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}