package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int value1;
        value1 = 100;
        // value1 = 200;
    }

    static void function(final int param){
        //param = 1004;
    }
}

//final 키워드를 이용하면 초기화 1회만 가능하다.
//final 키워드를 이용하면 값의 재할당이 불가능하다.
//final 키워드를 매개변수에도 적용할 수 있다.