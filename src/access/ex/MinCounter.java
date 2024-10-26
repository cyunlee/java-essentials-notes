package access.ex;

public class MinCounter {
    private int number;
    private int min;

    public MinCounter(int min){
        this.min = min;
        System.out.println("최소값을 " + min + "으로 지정합니다.");
    }

    public void decreasement(){
        if(isValid()){
            number -= 1;
        }else {
            System.out.println("최소값보다 작아질 수 없습니다.");
        }
    }

    public void getCount() {
        System.out.println("현재 값은 " + number + "입니다.");
    }

    private boolean isValid() {
        return number > min;
    }
}
