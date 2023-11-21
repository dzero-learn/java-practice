import java.util.Objects;

abstract class Shape {
    Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape {
    double r;

    Circle(double d) { // int는 자동형변환 되어 들어간다.
        this(new Point(), d);
    }

    Circle(Point p, double d) { // double로 들어온거 처리 어떻게 해줘야되는데? => 부모 멤버는 부모 생성자에서 초기화 / 자식 멤버는 자식 생성자에서 초기화
        super(p);
        this.r = d;
    }

    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) { // point 클래스는 int밖에 없는데 double로 들어온거 어떻게 처리하냐고
        this(new Point(), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }
    @Override
    double calcArea() {
        return width*height;
    }

    boolean isSquare() {
        return width * height > 0 && width == height;
    }
}

public class Main {
    public static double sumArea(Shape[] arr) {
        double sum = 0.0;
        for(Shape tmp : arr) {
            sum += tmp.calcArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println(" :"+sumArea(arr));
    }
}