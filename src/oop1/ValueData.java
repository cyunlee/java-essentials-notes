package oop1;

public class ValueData {
    int value;
    void increase(){
        value++; //자기 자신의 멤버변수를 이용한다.
        System.out.println("숫자 증가 value=" + value);
    }
}
