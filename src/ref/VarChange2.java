package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productNumber = 1;
        Product p2 = p1;

        System.out.println("p1 참조값: " + p1);
        System.out.println("p2 참조값: " + p2);
        System.out.println("p1.productNumber: " + p1.productNumber);
        System.out.println("p2.productNumber: " + p2.productNumber);

        //p1 변경
        p1.productNumber = 5;
        System.out.println("변경된 p1.productNumber: 5");
        System.out.println("p1.productNumber: " + p1.productNumber);
        System.out.println("p2.productNumber: " + p2.productNumber);

        //p2 변경
        p2.productNumber = 8;
        System.out.println("변경된 p2.productNumber: 8");
        System.out.println("p1.productNumber: " + p1.productNumber);
        System.out.println("p2.productNumber: " + p2.productNumber);
    }
}

// 인스턴스가 복사되어 대입되는 것이 아니라, 참조값이 복사되어 대입된다.
// 기본형과 참조형 모두 변수의 값(기본값 or 참조값)을 복사해서 대입한다.