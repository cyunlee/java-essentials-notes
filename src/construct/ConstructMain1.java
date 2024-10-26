package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        PersonConstruct person1 = new PersonConstruct(30, 180, "male");
        PersonConstruct person2 = new PersonConstruct(26, 175, "male");

        PersonConstruct[] people = new PersonConstruct[]{person1, person2};

        for (PersonConstruct person : people) {
            System.out.println("나이: " + person.age + " 키: " + person.height + " 성별: " + person.gender);
        }
    }
}

//생성자는 인스턴스가 생성되자마자 호출된다.
//'new' 키워드를 통해 생성자를 호출할 수 있다.
//생성자 이름 = 클래스 이름
//생성자를 직접 정의했다면 무조건 main 메서드에서 직접 정의한 생성자를 호출해야 한다. <필수★> <제약★>
//만약 직접 정의한 생성자가 없다면, 자바 자체적으로 기본 생성자(파라미터 X)를 만들어준다.
//하지만 만약 직접 정의한 게 하나라도 있다면, 기본 생성자를 만들어주지 않는다.★