import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        logger.debug(Objects.toString(s));
        logger.debug(Objects.toString(s2));
        logger.debug(Objects.toString(s3));
    }
}

class Singleton {
    private static Singleton s = new Singleton();
    
    private Singleton() {
    }

    public static Singleton getInstance() {
        // 클래스 변수 s가 null인 경우만 인스턴스를 생성하므로 위에 생성한 인스턴스 하나만 사용하게 된다.
        if(s == null)
            s = new Singleton();

        return s;
    }
}