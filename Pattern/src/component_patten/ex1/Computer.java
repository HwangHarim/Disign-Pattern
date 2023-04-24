package component_patten.ex1;

public class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;
  //  private Speaker speaker;

    public void addKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }

    public void addBody(Body body){
        this.body = body;
    }

    public void addMonitor(Monitor monitor){
        this.monitor = monitor;
    }

//    public void addSpeaker(Speaker speaker){
//        this.speaker = speaker;
//    }

    public int getPrice(){
        int bodyPrice = body.getPrice();
        int keyboardPrice = keyboard.getPrice();
        int monitorPrice = monitor.getPrice();
        //int speakerPrice = speaker.getPrice();
        return bodyPrice+keyboardPrice+monitorPrice;
    }

    public int getPower(){
        int bodyPower = body.getPower();
        int keyboardPower = keyboard.getPower();
        int monitorPower = monitor.getPower();
        //int speakerPrice = speaker.getPower();
        return bodyPower+keyboardPower+monitorPower;
    }

}
