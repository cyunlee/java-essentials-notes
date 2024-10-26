package access.ex;

import access.ex.MinCounter;

public class MinCounterMain {
    public static void main(String[] args) {
        MinCounter minCounter = new MinCounter(-3);

        minCounter.decreasement();;
        minCounter.decreasement();
        minCounter.decreasement();
        minCounter.decreasement();

        minCounter.getCount();

    }
}
