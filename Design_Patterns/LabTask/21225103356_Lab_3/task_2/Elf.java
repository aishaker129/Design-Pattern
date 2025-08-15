package task_2;

public class Elf implements Enemy {
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
    public Elf clone() {
        try {
            return (Elf) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("Elf Name: " + getName() + ", Power: " + getPower());
    }
}
