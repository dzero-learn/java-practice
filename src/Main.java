import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 객체를 생성한 것 x

    SutdaDeck() {
        for(int i=0; i<cards.length; i++) {
            int num = i%10+1; // 카드 숫자
            boolean isKwang = (i<10) && ( num == 1 || num == 3 || num == 8); // 이렇게 냅다 조건식을 적어도 되는거구나,,

            cards[i] = new SutdaCard(num,isKwang);
        }
    }

    // 카드 섞기
    void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int tmp = (int)(Math.random()*cards.length);
            SutdaCard sc;

            sc = cards[i];
            cards[i] = cards[tmp];
            cards[tmp] = sc;
        }
    }

    // 지정된 위치의 카드 반환
    SutdaCard pick(int index) {
        if(index < 0 || index > CARD_NUM) {
            return null;
        }

        return cards[index];
    }

    // 임의의 위치 카드 반환
    SutdaCard pick() {
        return pick((int)(Math.random()*20));
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

public class Main {
    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        logger.debug(String.valueOf(deck.pick(0)));
        logger.debug(String.valueOf(deck.pick()));
        deck.shuffle();

        String cardPrinter = "";
        for(int i=0; i<deck.cards.length; i++) {
            cardPrinter += deck.cards[i]+",";
        }
        logger.debug(cardPrinter);

        logger.debug(String.valueOf(deck.pick(0)));
    }
}