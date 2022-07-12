package ComponentPatten.exComponent;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
    private final List<ComputerDevice> computers = new ArrayList<>();

    public void addComponent(ComputerDevice component){
        computers.add(component);
    }

//    public void removeComponent(ComputerDevice component){
//        computers.remove(component);
//    }

    public int getPrice() {
        int price =0;
        for(ComputerDevice component : computers){
            price += component.getPrice();
        }
        return price;
    }

    public int getPower() {
        int power =0;
        for(ComputerDevice component : computers){
            power += component.getPower();
        }
        return power;
    }
}