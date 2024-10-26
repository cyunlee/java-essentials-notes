package construct;

public class PersonInitMain1 {
    public static void main(String[] args) {
        PersonInit person1 = new PersonInit();
        person1.age = 24;
        person1.height = 170;
        person1.gender = "female";

        PersonInit person2 = new PersonInit();
        person2.age = 17;
        person2.height = 165;
        person2.gender = "female";

        PersonInit[] people = new PersonInit[]{person1, person2};

        for (PersonInit person : people) {
            System.out.println("나이: " + person.age + " 키: " + person.height + " 성별: " + person.gender);
        }
    }
}
