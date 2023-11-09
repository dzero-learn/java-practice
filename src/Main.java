import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static double getDistance(int x, int y, int x1, int y1) {
        int a = x1-x; // 피타고라스 정리 선 a의 길이
        int b = y1-y; // 피타고라스 정리 선 b의 길이

        return Math.sqrt(a*a+b*b); // 피타고라스 정리 c의 길이 (sprt:루트)
    }

    public static void main(String[] args) {
            logger.debug(Double.toString(getDistance(1,1,2,2)));
    }
}