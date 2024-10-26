package access.a;

public class Access {
    public int publicMember;
    int defaultMember;
    private int privateMember;

    public void publicFunction(){
        System.out.println("publicMember = " + publicMember);
    }

    void defaultFunction(){
        System.out.println("defaultMember = " + defaultMember);
    }

    private void privateFunction(){
        System.out.println("privateMember = " + privateMember);
    }

    public void innerAccessFunction(){
        System.out.println("publicMember = " + publicMember);
        System.out.println("defaultMember = " + defaultMember);
        System.out.println("privateMember = " + privateMember);
        publicFunction();
        defaultFunction();
        privateFunction();
    }
}

//내부 메서드에서는 내부의 모든 것에 접근할 수 있다.
//내부 메서드가 public으로 설정되어 있기 때문에 다른 모든 곳에서도 호출할 수 있다.


