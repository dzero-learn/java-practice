import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static boolean isNumber(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }

        return str.matches("[0-9]*");
    }
    public static void main(String[] args) {
        String str = "123";
        logger.debug(str + "는 숫자입니까? "+isNumber(str));

        str = "1234ㅇ";
        logger.debug(str+"는 숫자입니까? "+isNumber(str));
    }
}