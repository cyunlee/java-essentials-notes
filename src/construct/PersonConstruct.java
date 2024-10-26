package construct;

public class PersonConstruct {
    int age;
    int height;
    String gender;

    PersonConstruct(int age, int height) {
        this(age, height, "female");
    }
    PersonConstruct(int age, int height, String gender){
        System.out.println("생성자 호출");
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
}

//생성자의 이름은 클래스의 이름과 같아야 하고, 반환 타입이 없어야 한다.
//매개변수의 개수를 다르게 하여 생성자를 오버로딩 할 수 있다.
//this를 통해 생성자 내부에서 다른 생성자를 호출하여 중복되는 코드를 제거할 수 있다.
//this는 생성자 코드 내부에서 첫 번재 줄에만 작성할 수 있다. first-line