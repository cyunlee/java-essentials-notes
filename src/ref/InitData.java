package ref;

public class InitData {
    int value1 = 1;
    int value2;
}

// 변수의 두 가지 종류 - 멤버 변수, 지역 변수
// 클래스 내부의 멤버 변수는 자동으로 초기화가 된다. **(0, false, null)** 참조형 변수 기본 값이 null로 초기화
// 메서드 내부의 지역 변수는 always 개발자가 직접 초기화 해야 한다.
// null은 참조값이 없음을 나타낸다. -> NullPointerException (null에 dot)