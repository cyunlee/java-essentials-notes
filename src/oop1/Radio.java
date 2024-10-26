package oop1;

public class Radio {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("라디오 전원을 켭니다.");
    }

    void off() {
        isOn = false;
        System.out.println("라디오 전원을 끕니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("라디오 볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("라디오 볼륨 : " + volume);
    }

    void showPresent() {
        if(isOn) {
            System.out.println("라디오 전원이 켜져있습니다. 볼륨 : " + volume);
        }else {
            System.out.println("라디오 전원이 꺼져있습니다.");
        }
    }
}
