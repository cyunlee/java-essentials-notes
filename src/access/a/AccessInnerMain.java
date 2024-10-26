package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        Access access = new Access();

        //public은 무조건 호출할 수 있다.
        access.publicMember = 100;
        access.publicFunction();

        //default(같은 패키지이므로) 호출할 수 있다.
        access.defaultMember = 200;
        access.defaultFunction();

        //private은 호출할 수 없다.(같은 클래스가 아니기 때문에)
    }
}
