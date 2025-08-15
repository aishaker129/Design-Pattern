package task_2;

public class Orc implements Enemy {
    private String name;
    private int power;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public Orc clone() {
        try {
            return (Orc) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("Orc Name: " + getName() + ", Power: " + getPower());
    }
}
