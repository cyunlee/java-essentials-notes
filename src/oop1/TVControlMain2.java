package oop1;

public class TVControlMain2 {
    public static void main(String[] args) {
        TVData data = new TVData();

        //TV 전원 켜기
        on(data);
        System.out.println("TV 전원을 켭니다.");

        //볼륨 UP
        volumeUp(data);
        System.out.println("TV 볼륨 : " + data.volume);

        //볼륨 Down
        volumeDown(data);
        System.out.println("TV 볼륨 : " + data.volume);

        //TV 상태
        showPresent(data);

        //TV 전원 끄기
        off(data);
        System.out.println("TV 전원을 끕니다.");
    }

    static void on(TVData data) {
        data.isOn = true;
        System.out.println("TV 전원을 켭니다.");
    }

    static void off(TVData data) {
        data.isOn = false;
        System.out.println("TV 전원을 끕니다.");
    }

    static void volumeUp(TVData data) {
        data.volume++;
        System.out.println("TV 볼륨 : " + data.volume);
    }

    static void volumeDown(TVData data) {
        data.volume--;
        System.out.println("TV 볼륨 : " + data.volume);
    }

    static void showPresent(TVData data) {
        System.out.println("TV 전원 상태 확인");
        if(data.isOn) {
            System.out.println("TV 전원 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("TV 전원 OFF");
        }
    }


}

// 클래스를 이용했다고 해서 객체 지향 프로그래밍은 아니다.
// 데이터와 기능이 분리 되어있고, 순서를 중요시한다면? -> 절차 지향 프로그래밍
// 데이터와 기능을 한 곳에 합칠 수는 없을까? -> 객체 지향 프로그래밍
// 데이터와 메서드가 분리되어 있으면, 유지보수가 힘들다. 둘이 떨어져 있으면 데이터 바뀌면 메서드 수정해야하고.. ~