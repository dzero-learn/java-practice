public class Main {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product cart index 배열 에 사용될
    void buy(Product p) {
        // 가진 돈이 물건 가격보다 적으면 리턴
        if(money < p.price) {
            System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
            return;
        }

        // 가진 돈이 충분하면 가진 돈에서 물건 값 빼기
        money -= p.price;
        // 구입한 물건 장바구니 추가
        add(p);
    }
    void add(Product p) {
        // i의 값이 장바구니의 크기보다 같거나 크면
        if(i >= cart.length) {
            // 기존의 장바구니보다 2배 큰 새로운 배열을 생성
            Product[] newCart = new Product[cart.length*2];
            // 기존 장바구니 값을 새로운 배열에 복사
            for(int j=0; j<cart.length; j++) {
                newCart[j] = cart[j];
            }

            // 새로운 장바구니와 기존 장바구니 바꾸기
            cart = newCart;
        }

        // 물건을 장바구니(cart)에 저장하고, i의 값 1 증가
        cart[i++] = p;
    }
    void summary() {
        String itemList = "";
        int totalPrice = 0;
        for(int j=0; j<cart.length; j++) {
            if(cart[j] == null) {
                break;
            }
            itemList += (j==0) ? cart[j] : ","+cart[j];
            totalPrice += cart[j].price;
        }
        System.out.println("구입한 물건:"+itemList);
        System.out.println("사용한 금액:"+totalPrice);
        System.out.println("남은 금액:"+money);
    }
}

class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}