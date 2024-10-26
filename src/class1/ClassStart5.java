package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(); //1번지
        animal1.type = "고양이";
        animal1.age = 5;
        animal1.weight = 4;

        Animal animal2 = new Animal(); //2번지
        animal2.type = "강아지";
        animal2.age = 8;
        animal2.weight = 6;

        Animal[] animals = new Animal[]{animal1, animal2};

        for(int i=0; i<animals.length; i++) {
            Animal a = animals[i];
            System.out.println("종: " + a.type + " 나이: " + a.age + " 몸무게: " + a.weight);
        }

        for(Animal a : animals) {
            System.out.println("종: " + a.type + " 나이: " + a.age + " 몸무게: " + a.weight);

        }
    }
}

// 배열을 도입했기 때문에 for문으로 리팩토링 할 수 있다.
