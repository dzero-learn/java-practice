import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prvChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.prvChannel = this.channel;

        if(channel > MAX_CHANNEL) this.channel = MAX_CHANNEL;
        else if(channel < MIN_CHANNEL) this.channel = MIN_CHANNEL;
        else this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        else if(volume < MIN_VOLUME) this.volume = MIN_VOLUME;
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(this.prvChannel);
    }
}
public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        logger.debug("CH:"+t.getChannel());
        t.setChannel(20);
        logger.debug("CH:"+t.getChannel());
        t.gotoPrevChannel();
        logger.debug("CH:"+t.getChannel());
        t.gotoPrevChannel();
        logger.debug("CH:"+t.getChannel());
    }
}