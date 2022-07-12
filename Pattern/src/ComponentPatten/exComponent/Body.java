package ComponentPatten.exComponent;

public class Body extends ComputerDevice {
    private final int price;
    private final int power;

    public Body(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }
}
