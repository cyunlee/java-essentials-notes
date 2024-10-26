package access;

public class BatteryMain {
    public static void main(String[] args) {
        Battery battery = new Battery(80);
        battery.charge(20);
        battery.charge(10);
        battery.use(50);

        //배터리 필트에 직접 접근
        System.out.println("필드에 접근하여 직접 충전량 조절");
        //battery.batteryLevel = 300; //-> 과부하가 되어버렸다..
        battery.showBattery();
    }
}

//private 접근 제어자를 사용하면 클래스 내부에서만 접근할 수 있다.
//클래스 밖에서는 private 필드에 접근할 수 없다. (제약★)
//private(클래스) -> default(패키지) -> protected(패키지+상속) -> public(공개)
//기본 접근 제어자 = default