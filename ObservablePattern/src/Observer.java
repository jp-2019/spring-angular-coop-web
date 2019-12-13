public abstract class Observer {

    public Subject subject;

    public abstract void update();

    public void add(Observer observer) {
    }
}
