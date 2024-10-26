package ref;

public class Method1 {
    public static void main(String[] args) {
        Beverage beverage1 = new Beverage();
        initBeverage(beverage1, "오렌지 주스", 3, 4500);

        Beverage beverage2 = new Beverage();
        initBeverage(beverage2, "캐모마일", 2, 4000);

        printBeverage(beverage1);
        printBeverage(beverage2);
    }
    static void initBeverage(Beverage beverage, String name, int number, int price) {
        beverage.name = name;
        beverage.number = number;
        beverage.price = price;
    }
    static void printBeverage(Beverage beverage) {
        System.out.println("이름: " + beverage.name + " 수량: " + beverage.number + " 가격: " + beverage.price);
    }
}
