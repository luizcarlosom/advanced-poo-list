import java.util.List;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class ScreenObserver implements Observer {
    private final PhoneSubject ps;
    private int cont;

    public ScreenObserver(PhoneSubject ps) {
        this.ps = ps;
        ps.addObserver(this);
    }

    @Override
    public void update(int sizeNumber) {
        cont += 1;
        if (cont == 12) {
            String digitsString = arraylistParaString(ps.getDigits());
            System.out.println("Agora discando " + digitsString + "...");
        }
    }

    private String arraylistParaString(List<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
        }
        return sb.toString();
    }
}
