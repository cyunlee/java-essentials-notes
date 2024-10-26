package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productNumber = 1000;
        System.out.println("메서드 호출 전: p1.productNumber = " + p1.productNumber);
        reference(p1);
        System.out.println("메서드 호출 후: p1.productNumber = " + p1.productNumber);
    }

    public static void reference(Product p) {
        p.productNumber = 1004;
    }
}

//메서드의 매개변수가 기본형인지 참조형인지에 따라 메서드의 동작이 달라진다.
//기본형 - 메서드 내부에서 변수의 값이 바뀌어도 원래 값에 영향이 없다.
//참조형 - 메서드 내부에서 변수의 값이 바뀌면 원래 값에 영향이 있다.
