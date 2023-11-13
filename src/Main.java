import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 객체를 생성한 것 x

    SutdaDeck() {
        for(int i=0; i<cards.length; i++) {
            // 내 문풀
            if(i < 10) {
                if(i==0) {
                    cards[i] = new SutdaCard(); // 생성자 있는거 사용하려고 굳이 분기ㅎ
                } else if(i == 2 || i == 7){ // 광 처리
                    cards[i] = new SutdaCard(i+1,true);
                } else {
                    cards[i] = new SutdaCard(i+1,false);
                }
            } else { // 다시 숫자 1부터 넣어줌
                cards[i] = new SutdaCard(i-9,false);
            }

            // 답지
            /*
            int num = i%10+1; // 카드 숫자
            boolean isKwang = (i<10) && ( num == 1 || num == 3 || num == 8); // 이렇게 냅다 조건식을 적어도 되는거구나,,

            cards[i] = new SutdaCard(num,isKwang);
             */
        }
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

        for(int i=0; i<deck.cards.length; i++) {
           logger.debug(deck.cards[i]+",");
        }
    }
}