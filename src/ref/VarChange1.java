package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a의 값 변경
        a = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b의 값 변경
        b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// 자바에서 대입은 변수의 값을 복사해서 대입한다.
