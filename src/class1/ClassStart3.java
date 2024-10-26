package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Animal animal1;
        animal1 = new Animal(); //1번지
        animal1.type = "고양이";
        animal1.age = 5;
        animal1.weight = 4;

        Animal animal2 = new Animal(); //2번지
        animal2.type = "강아지";
        animal2.age = 8;
        animal2.weight = 6;

        System.out.println("종: " + animal1.type + " 나이: " + animal1.age + " 몸무게: " + animal1.weight);
        System.out.println("종: " + animal2.type + " 나이: " + animal2.age + " 몸무게: " + animal2.weight);
    }
}

// 클래스도 자료형과 비슷한 타입이다.
// 사용자가 직접 정의하는 타입이자 설계도가 클래스이다.
// 클래스는 객체를 만들기 위한 용도이며, 'new 키워드'를 통해 메모리에 객체 or 인스턴스를 만들고 변수에 참조값을 저장한다.
// 객체에 값을 담고, 객체에 담긴 값을 사용하기 위해서는 .을 통해 메모리에 접근한다.