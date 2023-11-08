import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        int[] x = {10}; // int 배열타입의 참조형 변수
        int y = 20; // int타입의 기본형 변수

        logger.debug("main x값: " + x);
        logger.debug("main y값: " + y);

        logger.debug("change 메소드 전 x[0]: " + x[0]);
        logger.debug("change 메소드 전 y: " + y);

        change(x, y);

        logger.debug("change 메소드 후 x[0]: " + x[0]);
        logger.debug("change 메소드 후 y: " + y);
    }

    static void change(int[] x, int y) {
        logger.debug("change 진입!! ");
        logger.debug("change x값: " + x);

        x[0] = 1000;
        y = 2000;

        logger.debug("change 탈출!! ");
    }
}