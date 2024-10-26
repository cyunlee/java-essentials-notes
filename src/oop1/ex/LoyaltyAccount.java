package oop1.ex;

public class LoyaltyAccount {
    int point;

    void checkPoint(){
        System.out.println("포인트는 총 " + point + "입니다.");
    }

    void depositPoint(int point) {
        this.point += point;
        System.out.println(point +"만큼 적립되었습니다.");
        System.out.println("총 포인트 = " + this.point);
    }

    void withdrawPoint(int point) {
        if (this.point - point > 0 ) {
            this.point -= point;
            System.out.println(point + "만큼 차감되었습니다.");
            System.out.println("총 포인트 = " + this.point);
        } else {
            System.out.println("포인트가 부족합니다.");
        }
    }
}
