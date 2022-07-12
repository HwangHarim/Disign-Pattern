package ComponentPatten.ex1;

public class Keyboard {
    private final int price;
    private final int power;

    public Keyboard(int price, int power) {
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
