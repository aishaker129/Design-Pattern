package Design_Patterns.Iterator.emample2;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String name;
    private double price;

    Phone(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

interface Iterator<T>{
    boolean hasNext();
    T next();
}

class PhoneIterator implements Iterator{
    private List<Phone> phones;
    private int index = 0;

    PhoneIterator(List<Phone> phones){
        this.phones = phones;
    }

    public boolean hasNext(){
        return index < phones.size();
    }

    public Phone next(){
        return phones.get(index++);
    }
}

interface PhoneCollection{
    Iterator<Phone> createPhoneIterator();
}

class ShowRoom implements PhoneCollection{
    private List<Phone> phones = new ArrayList<>();

    public void addPhone(Phone phone){
        phones.add(phone);
    }

    public Iterator<Phone> createPhoneIterator(){
        return new PhoneIterator(phones);
    }
}

