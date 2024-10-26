package ref;

public class Method2 {
    public static void main(String[] args) {
        Beverage beverage1 = createBeverage("오렌지 주스", 3, 4500);
        Beverage beverage2 = createBeverage("캐모마일", 2, 4000);

        printBeverage(beverage1);
        printBeverage(beverage2);
    }

    static Beverage createBeverage(String name, int number, int price) {
        Beverage beverage = new Beverage();
        beverage.name = name;
        beverage.number = number;
        beverage.price = price;
        return beverage;
    }

    static void printBeverage(Beverage beverage) {
        System.out.println("이름: " + beverage.name + " 수량: " + beverage.number + " 가격: " + beverage.price);
    }
}
