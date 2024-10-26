package construct;

public class PersonInitMain3 {
    public static void main(String[] args) {
        PersonInit person1 = new PersonInit();
        person1.initPerson(24, 170, "female");

        PersonInit person2 = new PersonInit();
        person2.initPerson(17, 165, "female");

        PersonInit[] people = {person1, person2};

        for (PersonInit person : people) {
            System.out.println("나이: " + person.age + " 키: " + person.height + " 성별: " + person.gender);
        }
    }

}
