
public class Main {
    public static void main(String[] args) {
        // Build the object graph
        PhoneSubject ps = new PhoneSubject();

        Observer keyPadObserver = new KeyPadObserver(ps);
        Observer screenObserver = new ScreenObserver(ps);

        ps.setState(0);
        ps.setState(8);
        ps.setState(7);
        ps.setState(9);
        ps.setState(9);
        ps.setState(1);
        ps.setState(4);
        ps.setState(5);
        ps.setState(9);
        ps.setState(8);
        ps.setState(4);
        ps.setState(4);
    }
}
