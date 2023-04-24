package component_patten.exComponent;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(5,2);
        Body body = new Body(100,70);
        Monitor monitor = new Monitor(20,30);

        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println(computerPrice);
        System.out.println(computerPower);
    }
}
