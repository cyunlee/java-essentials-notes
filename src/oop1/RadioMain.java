package oop1;

public class RadioMain {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.on();
        radio.volumeUp();
        radio.volumeUp();
        radio.volumeDown();
        radio.showPresent();
        radio.off();
    }
}

//객체를 생성하는 과정과, 객체를 사용하는 과정을 따로 생각하자.
//애초에 다른 개발자가 각각을 담당한다고 생각하자.