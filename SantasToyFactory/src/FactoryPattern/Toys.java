package FactoryPattern;

import ObserverPattern.DwarfObserver;
import ObserverPattern.Subject;

public class Toys {

    Subject subject = new Subject();
    DwarfObserver dwarfObserver = new MagicBoard("Sam Winchester");

    public void DollDelivery(){

        System.out.println("You should thanks my fellow friend, Sam Winchester the dwarf");
        subject.addDwarfObserver(dwarfObserver);
        subject.setSubject("Doll");
    }
    public void BikeDelivery(){
        System.out.println("You should thanks my fellow friend, Sam Winchester the dwarf");
        subject.addDwarfObserver(dwarfObserver);
        subject.setSubject("Bike");

    }


}
