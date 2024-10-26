package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int value = 11;
        System.out.println("메서드 호출 before: value = " + value); // 11
        primitive(value);
        System.out.println("메서드 호출 after: value = " + value); // 11
    }

    static void primitive(int v) {
        v = 77;
    }
}
