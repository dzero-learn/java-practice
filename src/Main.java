import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MyPoint m = new MyPoint(1,1);

        logger.debug(Double.toString(m.getDistance(2,2)));
    }
}

class MyPoint {
    int x;
    int y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {
        int a = x1-this.x; // 피타고라스 정리 선 a의 길이
        int b = y1-this.y; // 피타고라스 정리 선 b의 길이

        return Math.sqrt(a*a+b*b); // 피타고라스 정리 c의 길이 (sprt:루트)
    }
}