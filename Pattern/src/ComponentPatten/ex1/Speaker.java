package ComponentPatten.ex1;

public class Speaker {
    private final int price;
    private final int power;

    public Speaker(int price, int power) {
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
