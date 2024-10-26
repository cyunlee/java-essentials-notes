package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        ConstructInit construct1 = new ConstructInit(100);
        ConstructInit construct2 = new ConstructInit(200);
        System.out.println("construct1 = " + construct1.data);
        System.out.println("construct2 = " + construct2.data);

        FieldInit field1 = new FieldInit();
        FieldInit field2 = new FieldInit();
        System.out.println("field1 = " + field1.data);
        System.out.println("field2 = " + field2.data);
    }
}

//static final 키워드 = 상수
//final 키워드로 필드에서 초기화(생성자x)하면, 모든 인스턴스의 변수 값이 같다.
//final 키워드로 필드에서 초기화하지 말자! -> 메모리가 낭비되기 때문 -> static으로 메모리를 공유하자
//static은 메모리에서 only one
