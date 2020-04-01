package human;

public class Android extends Person implements ChargeAble {

    private int charge;

    public Android(int charge) {
        this.charge = charge;
    }

    public Android(String name, int age, int charge) {
        super(name, age);
        this.charge = charge;
    }

    public Android(String name, int age, Gender gender, int charge) {
        super(name, age, gender);
        this.charge = charge;
    }

    @Override
    public String greeting() {
        return String.format("I'm half human, my Energy Level is %s %s", this.charge, "%");
    }

    @Override
    public int charge(int amount) {
        charge = charge + amount;
        if(charge > 100) charge = 100;
        return this.charge;
    }
}
