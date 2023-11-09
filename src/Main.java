import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("김영희",1,2,60,100,76);

        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        logger.debug("이름:"+s.name);
        logger.debug("총점:"+s.getTotal());
        logger.debug("평균:"+s.getAverage());

        logger.debug(s2.info());
    }
}

class Student {
    String name;
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        // 평균 구함
        float avg = ((float)getTotal())/3;
        // 소수점 둘째자리에서 반올림 처리
        avg = Float.parseFloat(String.format("%.1f",avg));

        return avg;
    }

    String info() {
        return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + getTotal() + "," + getAverage();
    }
}