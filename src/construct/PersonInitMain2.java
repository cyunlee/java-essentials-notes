package construct;

public class PersonInitMain2 {
    public static void main(String[] args) {
        PersonInit person1 = new PersonInit();
        initPerson(person1, 24, 170, "female");

        PersonInit person2 = new PersonInit();
        initPerson(person2, 17, 165, "female");

        PersonInit[] people = new PersonInit[]{person1, person2};

        for (PersonInit person : people) {
            System.out.println("나이: " + person.age + " 키: " + person.height + " 성별: " + person.gender);
        }
    }

    static void initPerson(PersonInit person, int age, int height, String gender) {
        person.age = age;
        person.height = height;
        person.gender = gender;
    }
}
