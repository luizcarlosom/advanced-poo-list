/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPadObserver implements Observer{
    private final PhoneSubject ps;

    public KeyPadObserver(PhoneSubject ps) {
        this.ps = ps;
        ps.addObserver(this);
    }

    @Override
    public void update(int newDigit) {
        System.out.println("Pressionando: " + newDigit);
        System.out.println(ps.getState());
    }

}
