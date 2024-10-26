package class1.ex;

public class ReservationMain {
    public static void main(String[] args) {
        Reservation r1 = new Reservation();
        r1.customer = "이시윤";
        r1.numberOfPeople = 4;
        r1.bookingNum = 1000;

        Reservation r2 = new Reservation();
        r2.customer = "홍길동";
        r2.numberOfPeople = 2;
        r2.bookingNum = 1004;

        Reservation[] reservations = new Reservation[]{r1, r2};

        for (Reservation r : reservations) {
            System.out.println("예약자 이름: " + r.customer + " 인원 수: " + r.numberOfPeople + " 예약 번호: " + r.bookingNum);
        }
    }
}
