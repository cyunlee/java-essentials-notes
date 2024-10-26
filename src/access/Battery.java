package access;

public class Battery {
    private int batteryLevel;

    Battery(int batteryLevel){
        this.batteryLevel = batteryLevel; //초기 배터리량 설정
    }

    void charge(int amount){
        if(batteryLevel+amount>100) {
            System.out.println("배터리를 충전할 수 없습니다. 최대치입니다.");
        } else {
            batteryLevel+=amount;
            System.out.println("배터리가 " + amount +"만큼 충전되었습니다.");
        }
    }

    void use(int amount){
        batteryLevel -= amount;
        System.out.println(amount + "만큼 배터리를 사용했습니다.");
    }

    void showBattery(){
        System.out.println("현재 배터리: " + batteryLevel);
    }
}

//배터리 량이 100을 초과하면 과부하 상태가 된다.
