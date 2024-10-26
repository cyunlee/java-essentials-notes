package access;

public class AirconditionerMain {
    public static void main(String[] args) {
        Airconditioner aircon = new Airconditioner();
        aircon.upTemperature(10);
        aircon.downTemperature(15);
        aircon.showTemperature();
    }
}
