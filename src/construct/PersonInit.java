package construct;

public class PersonInit {
    String gender;
    int height;
    int age;

    void initPerson(int age, int height, String gender) {
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
}

//this -> 자기 자신의 인스턴스를 가리킨다.
//멤버 변수와 매개 변수의 이름이 중복되는 경우에만 this를 쓰는 것이 좋다.