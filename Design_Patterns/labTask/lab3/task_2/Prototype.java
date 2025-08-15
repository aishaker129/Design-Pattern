package task_2;

public class Prototype {
    public static void main(String[] args) {
        Orc orc = new Orc();
        orc.setName("Gor");
        orc.setPower(100);
        orc.display();
        Orc cln = orc.clone();
        cln.setName("Gor Clone");
        cln.setPower(70);
        System.out.print("Cloned Orc: ");
        cln.display();
        

        Elf elf = new Elf();
        elf.setName("Zug");
        elf.setPower(80);
        elf.display();
        Elf cln2 = elf.clone();
        cln2.setName("Zug Clone");
        cln2.setPower(60);
        System.out.print("Cloned Elf: ");
        cln2.display();

        Dragon dragon = new Dragon();
        dragon.setName("Dragonus");
        dragon.setPower(200);
        dragon.display();
        Dragon cln3 = dragon.clone();
        cln3.setName("Dragonus Clone");
        cln3.setPower(150);
        System.out.print("Cloned Dragon: ");
        cln3.display();
    }
}
