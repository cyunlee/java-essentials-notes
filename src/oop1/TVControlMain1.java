package oop1;

public class TVControlMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //TV 전원 켜기
        isOn = true;
        System.out.println("TV 전원을 켭니다.");

        //볼륨 UP
        volume++;
        System.out.println("TV 볼륨 : " + volume);

        //볼륨 UP
        volume++;
        System.out.println("TV 볼륨 : " + volume);

        //TV 상태
        System.out.println("TV 전원 상태 확인");
        if(isOn) {
            System.out.println("TV 전원 ON, 볼륨 : " + volume);
        } else {
            System.out.println("TV 전원 OFF");
        }

        //TV 전원 끄기
        isOn = false;
        System.out.println("TV 전원을 끕니다.");
    }
}

//흐름 순서대로 절차를 지향하며 코딩하는 것을 절차 지향 프로그래밍이라고 한다.