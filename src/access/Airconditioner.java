package access;

public class Airconditioner {

    private int temperature;

    public Airconditioner() {
        this.temperature = 26;
    }
    public void upTemperature(int number) {
        if(isTemperatureOK(number)) {
            temperature += number;
            System.out.println(number + "만킄 온도를 올렸습니다.");
        }else {
            System.out.println("유효하지 않은 온도입니다.");
        }
    }

    public void downTemperature(int number) {
        if(isTemperatureOK(number)){
            temperature -= number;
            System.out.println(number + "만큼 온도를 내렸습니다.");
        }else {
            System.out.println("유효하지 않은 온도입니다.");
        }
    }

    public void showTemperature(){
        System.out.println("현재 온도는 " + temperature + "입니다.");
    }

    private boolean isTemperatureOK(int number) {
        return number > 0;
    }
}

//데이터는 필수적으로 숨긴다. ★
//메서드는 사용자에게 필요한 부분만 노출시키고 나머지는 숨긴다. ex- 내부로직