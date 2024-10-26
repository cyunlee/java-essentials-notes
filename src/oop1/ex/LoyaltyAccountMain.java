package oop1.ex;

import oop1.ex.LoyaltyAccount;

public class LoyaltyAccountMain {
    public static void main(String[] args) {
        LoyaltyAccount loyaltyAccount = new LoyaltyAccount();

        loyaltyAccount.depositPoint(1000);
        loyaltyAccount.withdrawPoint(8000);
        loyaltyAccount.withdrawPoint(500);
        loyaltyAccount.checkPoint();
    }
}

//객체 지향 = 객체와 객체들 사이의 관계를 중요시한다. (데이터와 기능을 클래스로 묶음 -> 캡슐화)
//절차 지향 = 프로그램의 실행 순서를 중요하게 생각한다. (데이터와 기능이 분리)