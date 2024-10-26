package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        increase(valueData);
        increase(valueData);
        increase(valueData);
        System.out.println("결과 값=" + valueData.value);
    }

    static void increase(ValueData valueData) {
        valueData.value++;
        System.out.println("값 증가=" + valueData.value);
    }
}

