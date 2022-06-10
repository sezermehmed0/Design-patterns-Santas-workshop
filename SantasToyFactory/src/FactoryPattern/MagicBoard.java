package FactoryPattern;

import ObserverPattern.DwarfObserver;
import ObserverPattern.Observable;

public class MagicBoard implements DwarfObserver {

    private Observable subject;


    public MagicBoard(String ObserverName){
    }

    @Override
    public void update() {
    String PreviousWish = this.subject.getUpdate();

        WorkShop craftingTable = new ToyFactory();
        Product product = craftingTable.MakeToyReady(PreviousWish);

    }

    @Override
    public void setSubject(Observable subject) {
        this.subject = subject;

    }
}
