import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static int abs(int n) {
        return n < 0 ? -n : n; // n*(-1) 대신 부호만 바꿔줘도 됨
    }
    public static void main(String[] args) {
        int value = 5;
        logger.debug(value+"의 절대값 :"+abs(value));
        value = -10;
        logger.debug(value+"의 절대값 :"+abs(value));
    }
}