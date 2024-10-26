package final1;

public class Constant {
    public static final double PI = 3.14;
    public static final int ONE_MONTH = 30;
    public static final int ONE_YEAR = 365;
}

//상수는 데이터가 변할 염려가 없기 때문에 클래스에 직접 접근에서 사용해도 된다.
//캡슐화가 필요하지 않다.
//추후 유지보수를 위해 고정된 값들은 상수로 설정하는 것이 좋다. (기준 값들..)
//final이 참조형 인스턴스 변수 앞에 오더라도, 인스턴스의 값은 바꿀 수 있다.