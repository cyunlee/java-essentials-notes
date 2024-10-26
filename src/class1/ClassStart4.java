package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(); //1번지
        animal1.type = "고양이";
        animal1.age = 5;
        animal1.weight = 4;

        Animal animal2 = new Animal(); //2번지
        animal2.type = "강아지";
        animal2.age = 8;
        animal2.weight = 6;

        Animal[] animals = new Animal[2];
        animals[0] = animal1;
        animals[1] = animal2;

        System.out.println("종: " + animals[0].type + " 나이: " + animals[0].age + " 몸무게: " + animals[0].weight);
        System.out.println("종: " + animals[1].type + " 나이: " + animals[1].age + " 몸무게: " + animals[1].weight);
    }
}

// 배열도 'new'를 통해 생성되기 때문에 참조값이 들어간다.
// 인스턴스 변수에는 인스턴스가 들어가는 것이 아니라, 참조값만 복사해서 들어있을 뿐이다.
// 자바에서 변수를 대임할 때는 변수의 값이 복사되어 전달된다.