public class Lamp {
    //Attributes
    private String name;
    private boolean lampIsOn = false;

    //Constructors
    public Lamp(String name, boolean lampIsOn) {
        this.name = name;
        this.lampIsOn = lampIsOn;
    }

    public Lamp(String name) {
        this.name = name;
    }

    //Methods
    public void turnOn() {
        this.lampIsOn = true;
    }

    public void turnOff() {
        this.lampIsOn = false;
    }

    public void toggle() {
        if (lampIsOn) {
            turnOff();
        }
        else {
            turnOn();
        }
    }

    public boolean isOn() {
        return lampIsOn;
    }

    @Override
    public String toString() {
        if (lampIsOn) {
            return name + " er tændt.";
        } else {
            return name + " er slukket.";
        }
    }
}
