import java.util.ArrayList;
import java.util.List;

public class PhoneSubject extends Subject {
    private List<Integer> digits = new ArrayList<>();
    private int state;

    public void setState(int newDigit) {
        this.state = newDigit;
        digits.add(state);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public int getState() {
        return state;
    }
}
