package access.b;

import access.a.Access;

public class AccessOuterMain {
    public static void main(String[] args) {
        Access b = new Access();
        b.publicMember = 100;
        b.publicFunction();
        b.innerAccessFunction();
    }
}
