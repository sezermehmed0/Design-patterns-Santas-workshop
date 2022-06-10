package ObserverPattern;

public interface Observable {

    void addDwarfObserver(DwarfObserver observer);
    void removeDwafObserver(DwarfObserver observer);

    void notifyObserver();
    String getUpdate();
}
