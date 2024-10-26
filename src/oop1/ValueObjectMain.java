package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.increase();
        valueData.increase();
        valueData.increase();
        System.out.println("결과 값=" + valueData.value);
    }
}

//객체 지향 언어에서는 클래스 내부에 속성과 기능을 포함할 수 있다.
//속성과 기능이 한 군데에 모여져 있는 것 = 객체 지향 프로그래밍
//메서드를 사용하기 위해서는 인스턴스를 생성하고 .(dot)을 활용해 접근한다. (멤버변수와 동일)