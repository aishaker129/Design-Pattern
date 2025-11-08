package Design_Patterns.Iterator.emample2;

public class PhoneDemo {
    public static void main(String[] args) {
        ShowRoom dokan = new ShowRoom();

        dokan.addPhone(new Phone("Motorola", 25000));
        dokan.addPhone(new Phone("Realme C55", 20000));
        dokan.addPhone(new Phone("Tecno", 15000));
        dokan.addPhone(new Phone("Apple", 120000));

        Iterator<Phone> it = dokan.createPhoneIterator();

        System.out.println("All phone model: ");
        while(it.hasNext()){
            Phone p = it.next();
            System.out.println(p.getName()+" "+p.getPrice());
        }
    }
}
