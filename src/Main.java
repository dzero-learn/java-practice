import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
        // (1) 전원이 켜져있으면 끄고, 꺼져있으면 켠다.
        /*if(isPowerOn == true) isPowerOn = false;
        else isPowerOn = true;*/

        // 와웅 이렇게 간단하게 적을 수 있다니
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        // (2) 볼륨의 값이 MAX_VOLUME보다 작을 때만 1 증가
        if(this.volume < MAX_VOLUME) {
            this.volume++;
        }
    }
    void volumeDown() {
        // (3) 볼륨의 값이 MIN_VOLUME보다 클 때만 1 감소
        if(this.volume > MIN_VOLUME) {
            this.volume--;
        }
    }
    void channelUp() {
        // (4) 채널의 값을 1증가, 만약 채널이 MAX_CHANNEL이면 채널 값을 MMAX_CHANNEL 값으로 변경
        if(this.channel < MAX_CHANNEL) {
            this.channel++;
        } else if(this.channel == MAX_CHANNEL) {
            this.channel = MIN_CHANNEL;
        }
    }
    void channelDown() {
        // (5) (4)번과 반대 조건
        if(this.channel > MIN_CHANNEL) {
            this.channel--;
        } else if(this.channel == MIN_CHANNEL) {
            this.channel = MAX_CHANNEL;
        }
    }

}
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        logger.debug("CH:"+t.channel+", VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        logger.debug("CH:"+t.channel+", VOL:"+t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        logger.debug("CH:"+t.channel+", VOL:"+t.volume);
    }
}