package oop1;

public class Triangle {
    int side1;
    int side2;
    int side3;
    void equalTriangle() {
        if(side1==side2 && side2==side3) {
            System.out.println("정삼각형 입니다.");
        }else {
            System.out.println("정삼각형이 아닙니다.");
        }
    }

}
