public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(12);
        System.out.println("Now the state changes again");
        subject.setState(30);


    }
}
