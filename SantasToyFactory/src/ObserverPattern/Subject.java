package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

    private List<DwarfObserver> dwarfObservers;
    private String Subject;

    public Subject(){

        this.dwarfObservers = new ArrayList<>();
    }




    @Override
    public void addDwarfObserver(DwarfObserver observer) {

        this.dwarfObservers.add(observer);
        observer.setSubject(this);

    }

    @Override
    public void removeDwafObserver(DwarfObserver observer) {

        this.dwarfObservers.remove(observer);
        observer.setSubject(null);

    }

    @Override
    public void notifyObserver() {

        for (DwarfObserver dwarfObserver:this.dwarfObservers){
            dwarfObserver.update();
        }

    }

    @Override
    public String getUpdate() {
        return this.Subject;
    }

    public  void  setSubject(String Subject){

        this.Subject = Subject;
        this.notifyObserver();

    }
}
