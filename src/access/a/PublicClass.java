package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}

//public class는 파일명과 이름이 같아야 하며, 파일 당 하나만 존재한다.★
//하나의 파일 안에 여러 개의 클래스가 있을 수 있는데, default 클래스는 여러 개여도 상관 없다.
