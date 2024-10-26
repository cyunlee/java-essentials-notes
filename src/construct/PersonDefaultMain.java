package construct;

public class PersonDefaultMain {
    public static void main(String[] args) {
        PersonDefault personDefault = new PersonDefault(); //기본 생성자 호출
    }
}

//직접 정의한 생성자가 없다면 default 생성자를 자바 자체적으로 만들어준다.
//생성자는 무조건적으로 호출된다. (기본이든 커스텀이든)
